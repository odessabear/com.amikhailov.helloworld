package com.amikhailov.t4;

/**
 * Created by X501A on 13.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        try {
            st1.setAge(-3);
        } catch (Exception e) {

        }

        Student st2 = new Student();
        try {
            st2.setAge(-3);
        } catch (Exception e) {

        }
        System.out.println("uiuiu");
    }
}
