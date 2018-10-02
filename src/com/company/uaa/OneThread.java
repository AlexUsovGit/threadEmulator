package com.company.uaa;

import javafx.scene.image.ImageView;

public class OneThread extends Thread {
    private ImageView imgAvto;

    public OneThread(ImageView imgAvto) {
        this.imgAvto = imgAvto;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Первый поток");
            imgAvto.setX(imgAvto.getX() + 10.0);

            //three
        }
    }
}
