package com.vzap;

import java.util.Scanner;

public class MessageFlasherTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter message");
        String msg = scanner.nextLine();
        MessageFlasherThread ft = new MessageFlasherThread(msg);
        Thread thread = new Thread(ft);
        thread.start();

        for (int i = 400; i >= 0; i -= 50) {
            System.out.println("count down " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            if (i == 100) {
                ft.stop();
            }
        }
    }
}