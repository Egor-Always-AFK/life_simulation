package com.example.life_simulation;
import com.example.life_simulation.utils.CustomThread;

import java.time.*;
public class LoopSimulation {

    private boolean isStart = false;
    private CustomThread thread = null;
    public void startSimulaton() throws InterruptedException {
        if (!isStart) {
            thread = new CustomThread();
            thread.start();
            isStart = true;
        }
    }

    public void stopSimulation() throws InterruptedException {
        thread.setStopThread();
        isStart = false;
    }

    boolean getIsStart() {
        return isStart;
    }
}
