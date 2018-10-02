package com.company.uaa;

import javafx.scene.image.ImageView;

public class ThreeThread extends Thread {
    private ImageView imgAvto;

    public ThreeThread(ImageView imgAvto) {
        this.imgAvto = imgAvto;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Третий поток");
            imgAvto.setX(imgAvto.getX() + 15.0);


        }
    }
}
