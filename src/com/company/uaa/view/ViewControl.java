package com.company.uaa.view;

import com.company.uaa.OneThread;
import com.company.uaa.ThreadFromRunnable;
import com.company.uaa.ThreeThread;
import com.company.uaa.TwoThread;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewControl implements Initializable {

    @FXML
    private ImageView imgThr1;
    @FXML
    private ImageView imgThr2;
    @FXML
    private ImageView imgThr3;
    @FXML
    private Line lineThread;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        System.out.println("Начало главного потока");

        OneThread oneThread = new OneThread(imgThr1);
        TwoThread twoThread = new TwoThread(imgThr2);
        ThreeThread threeThread = new ThreeThread(imgThr3);

        ThreadFromRunnable thrFR = new ThreadFromRunnable(lineThread);
        Thread threadFromR = new Thread(thrFR);
        Thread thrFromAnon = new Thread(() -> System.out.println("Anon"));

        oneThread.start();
        twoThread.start();
        threeThread.start();
        System.out.println("Конец главного потока");


    }


    public void getNewSize(double size) {
        lineThread.setEndX(lineThread.getEndX() + size);
    }


}
