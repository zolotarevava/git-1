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
            readDir(f);
        }
        else System.out.println("\nNot directory: " + path);
    }

    public static void readDir(File directory){
        if (directory.isDirectory()){
            for (File file : directory.listFiles()) {
                if(file.isFile()){
                    System.out.println("\t" + file.getName());
                }else {
                    System.out.println("-dir- " + file.getName());
                    readDir(file);
                }
            }
        }
    }


}
