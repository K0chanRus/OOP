package org.example.Lison1.Task06.LSP;

public class MainLSP {
    public static void main(String[] args) {
        QuadRangle test = new Rectangle(4, 5);
        printArea(test);
        test = new Square(4);
        printArea(test);
    }

    public static void printArea(QuadRangle quadRangle){
        System.out.println(quadRangle.area());
    }

}