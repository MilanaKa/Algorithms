package alg2.Algorithms2.alg2.alg4;


import alg2.Algorithms2.alg2.alg4.Controller.Controller;

public class Main {
    public static void main(String[]args){
        Controller c= new Controller();
        System.out.println(c.decimalToBinary(4));
        System.out.println(c.decimalToBinary(15));

        System.out.println(c.binaryToDecimal("100"));

    }
}
