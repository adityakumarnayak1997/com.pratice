package com.pratice;
class K {
    // instance variable
    int x = 1;
    
    // method parameter
    public void display(int x) {
        System.out.println(x);
        System.out.println(this.x);
    }
}

public class Example1 {
    public static void main(String[] args) {
        K a = new K();
        a.display(2);
    }
}