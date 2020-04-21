import static java.lang.Math.*;

public class HeadFirstExample1 {
    public static void main(String[] args){

        int x = 10;
        String name = "Birdman";
        x = x * 4;
        System.out.println("X is " + x);
        double d = Math.random();

        while (x > 12 ) {
            x = x +1;
        }
        for (x = 0; x < 10; x = x +1) {
            System.out.println("X is now " + x);
        }

        if (x == 3) {
            System.out.println("X must be 10");
        } else {
            System.out.println("X is not 10");
        } if ((x < 4) & (name.equals("Birdman"))){
            System.out.println("5*G");
        }
        System.out.println("I think I got this, kinda :)");





    }

}
