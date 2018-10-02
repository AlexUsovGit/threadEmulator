package com.company.uaa;

import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class TwoThread extends Thread {
    private ImageView imgAvto;

    public TwoThread(ImageView imgAvto) {
        this.imgAvto = imgAvto;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Второй поток");
            imgAvto.setX(imgAvto.getX() + 20.0);


        }
    }
}
