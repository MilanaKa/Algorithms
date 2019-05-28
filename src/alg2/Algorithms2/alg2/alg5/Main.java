package alg5;

public class Main {
    public static void main(String[]args){
        alg5.controller.PrimaryController pc = new alg5.controller.PrimaryController();
        System.out.println(pc.isPrimary(7));
        System.out.println(pc. isPrimary(8));
        System.out.println(pc. isPrimary(1) );


        pc.primaryGenerator(1000);

    }
}
