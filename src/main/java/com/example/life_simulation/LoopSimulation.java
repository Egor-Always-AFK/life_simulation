package com.example.life_simulation;
import com.example.life_simulation.utils.CustomThread;

import java.time.*;
public class LoopSimulation {

    private boolean isStart = false;
    private final CustomThread thread = new CustomThread();
    public void startSimulaton() throws InterruptedException {
        if (!isStart) {
            thread.start();
            isStart = true;
        }
    }

    public void stopSimulation() throws InterruptedException {
        thread.setStopThread();
        isStart = false;
    }

}
