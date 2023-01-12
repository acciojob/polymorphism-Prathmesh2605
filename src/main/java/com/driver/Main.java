package com.driver;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        int x = 10,y=20,z=30;

        double a = 10, b=20;

        Product p = new Product();
        System.out.println(p.product(x, y));
        System.out.println(p.product(a,b));
        System.out.println(p.product(x,y,z));
    }
}
class Product{
    public  int product(int x, int y){
        return x*y;
    }
    public  double product(double x, double y){
        return x*y;
    }
    public  int product(int x, int y, int z){
        return x*y*z;
    }
}