package com.company.uaa;

import com.company.uaa.view.ViewControl;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class ThreadFromRunnable implements Runnable {

    private Line lineThread;

    public ThreadFromRunnable(Line lineThread) {
        this.lineThread = lineThread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lineThread = new Line();
            lineThread.setStartX(200);
            lineThread.setStartY(200);
            lineThread.setEndX(350);
            lineThread.setEndY(350);
            lineThread.setFill(Color.RED);


            System.out.println("Поток ThreadFromRunnable");



        }
    }
}
