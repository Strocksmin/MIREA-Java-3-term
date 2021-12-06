package com.company.lab23_24;

public class Main {
    public static void main(String[] args) {
        final String filename = "movementList.csv";
        new CSVParse().test(filename);
        HTML html=new HTML();
        System.out.println("Код страницы:\n"+html.code()+"\nСсылки на изображения:\n");
        html.imgsrc();
        html.download();
        System.out.println("Загруженные файлы:\n");
        html.showDownloads();
    }
}