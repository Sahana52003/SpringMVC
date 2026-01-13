package com.xworkz.nandu.main;

public class Nandu {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (Exception obj) {
            System.out.println("Exception :" + obj.getMessage());
            obj.printStackTrace();
        }
    }
}
