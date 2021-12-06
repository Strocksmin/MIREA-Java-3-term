package com.company.lab27_28;

import java.io.File;

public class Main {
    public static void main(String[] args)
    {
        int Processors = Runtime.getRuntime().availableProcessors();
        String srcFolder = "images";
        String dstFolder = "dst";
        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();
        int middle = files.length / Processors;
        long start = System.currentTimeMillis();
        for (int i = 0; i < Processors - 1; i++){
            File[] files1 = new File[middle];
            System.arraycopy(files, 0 + (middle * i), files1, 0, middle);
            ArtemMad img = new ArtemMad(files1, dstFolder, start);
            new Thread(img).start();
        }
        File[] files2 = new File[files.length - middle * (Processors - 1)];
        System.arraycopy(files, middle * (Processors - 1), files2, 0, files2.length);
        ArtemMad img2 = new ArtemMad(files2, dstFolder, start);
        new Thread(img2).start();
    }
}
