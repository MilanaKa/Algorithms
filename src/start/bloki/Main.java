package start.bloki;

import start.bloki.controler.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wykładnik potęgi ");
        int y = scanner.nextInt();
        System.out.println("Podaj podstawę potęgi");
        int x = scanner.nextInt();

        Controller a = new Controller();
        System.out.println(x + "^" + y + "=" + a.power(x, y));



//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Wprowadż kolejno a,r,n");
//        System.out.println(a.arSequence( scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));

    }

}
