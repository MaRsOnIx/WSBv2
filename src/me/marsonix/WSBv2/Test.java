package me.marsonix.WSBv2;


public class Test {

    public static void main (String args[]) {

        double x = 7.5;
        double y = 5.4;

        System.out.println("x równa się " + x); // break point
        System.out.println("y równa się " + y); // break point

        double z = x + y;
        System.out.println("x + y równa się " + z); // break point

        z = Math.round(x - y);
        System.out.println("x - y równa się " + z); // break point

    }


}
