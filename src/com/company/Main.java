package com.company;

public class Main {

    public static void Mymethod(int a){
    int d=3;
    int b=a%d;
    if (b == 0){
     System.out.println("true");
    }
    else {
     System.out.println("false");
    }
}

public static void main(String[] args){
    Mymethod(9);
    Mymethod(25);
    Mymethod(102);
    }
}
