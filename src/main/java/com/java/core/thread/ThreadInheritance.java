package com.java.core.thread;

public class ThreadInheritance {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new NewThread();
        thread.start();
    }

    public static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("We are in thread: " + this.getName());
        }
    }

}
