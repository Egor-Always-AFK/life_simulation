package com.example.life_simulation.utils;

import java.time.LocalTime;

public class CustomThread extends Thread {
    boolean needKill = false;
    @Override
    public void run() {
        while (true) {
            System.out.println("id: " + this.getId() + " | thread time: " + LocalTime.now().getSecond());
            try {
                Thread.sleep(1000);
                if (needKill)
                    break;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.interrupt();
    }

    public void setStopThread() {
        needKill = true;
    }

}