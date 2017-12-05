package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full path: ");
        String path = scanner.nextLine();
        File f = new File(path);
        //проверка на существование указанного каталога
        if (f.exists()) {
            list(path);
        }
        else System.out.println("\nNot directory: " + path);
    }

    static  void  list(String path) {
        File f = new File(path);
        String[] sDirList = f.list();
        //обработка содержимого каталога
        for (int i = 0; i < sDirList.length; i++) {
            //для каждого элемента массива создаем объект класса File и проверяем, соответствует ли он файлу или каталогу
            File f1 = new File(path + File.separator + sDirList[i]);
            if (f1.isFile())
                System.out.println(path + File.separator + sDirList[i]);
            else
                //если каталог, рекурсивный вызоы метода list
                list(path + File.separator + sDirList[i]);

        }


    }

}
