package com.amikhailov.t6;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by X501A on 10.08.2017.
 */
public class FileMain {
    public static void main(String[] args) {
        File path = new File(".");
        System.out.println(path.exists());
        System.out.println(path.isDirectory());
        File[] list = path.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return true;
                }
                if (pathname.getName().endsWith(".jpg") || pathname.getName().endsWith(".JPG") || pathname.getName().endsWith(".png")) {
                    return true;
                }
                return false;
            }
        });


        try {

           FileCopyUtils copy = new FileCopy();
            copy.copyFile("D:\\Development\\file.txt", "D:\\Development\\file_copy.txt");
        } catch (Exception e) {
            System.err.println("could not copy file");
            e.printStackTrace();
        }

      //  for (int i = 0; i < list.length; i++) {
        //    System.out.println(list[i].getAbsolutePath());
       // }
        path = new File(".");
        list = path.listFiles();
        for(int i = 0; i < list.length; i++)
            System.out.println(list[i].getName());



    }
}
