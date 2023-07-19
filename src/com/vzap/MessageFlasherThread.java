package com.vzap;

public class MessageFlasherThread implements Runnable {
    private String msg;
    private boolean stopped;

    public MessageFlasherThread(String message) {
        this.msg = message;
        this.stopped = false;
    }

    public void run() {
        try {
            for (int i = 0; i < msg.length() && !stopped; i++) {
                System.out.print(msg.charAt(i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }
    }

    public void stop() {
        stopped = true;
    }
}