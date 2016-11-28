package com.zheng.hz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static volatile boolean running = true;
    private static ClassPathXmlApplicationContext context;

    public static void main(String[] args) {
        startServer();
        synchronized (Main.class) {
            while (running) {
                try {
                    Main.class.wait();
                } catch (Throwable e) {
                }
            }
        }
    }

    private static void startServer() {
        context = new ClassPathXmlApplicationContext("application-context.xml", "dubbo-provider.xml");
        context.start();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                stopServer();
            }
        });
        logger.info("shop-service started!");
    }

    private static void stopServer() {
        context.close();
        synchronized (Main.class) {
            running = false;
            Main.class.notify();
        }
        logger.info("shop-service stopped!");
    }
}
