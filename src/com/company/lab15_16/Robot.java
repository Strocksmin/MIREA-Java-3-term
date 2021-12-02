package com.company.lab15_16;

public class Robot {

    public final Object monitor = new Object();

    class Leg implements Runnable {

        private final String name;
        //private final Object monitor = new Object();  вызывается один раз
        Leg(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            while(true) {
                synchronized (monitor) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    step();
                    monitor.notify();
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

         private void step() {
            System.out.println(name);
        }
    }


    void run() {
        Leg left = new Leg("LEFT");
        Leg right = new Leg("RIGHT");
        new Thread(left).start();
        new Thread(right).start();
    }

    public static void main(String[] args) {
        new Robot().run();
    }
}
