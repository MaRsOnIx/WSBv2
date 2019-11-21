package me.marsonix.WSBv2;

import java.util.Random;
import java.util.Scanner;

public class WSBv2 {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
      //  int liczba = sc.nextInt();

        // <- 5;10 >
        // <= Mniejsza bądź równa
        // >= Większa bądź równa
        // && i

//        if(liczba <= 10 && liczba >=-5 )
//            System.out.println("Hello");


       // Random random = new Random();

//        int liczba = random.nextInt(100)+1;
//
//
//        // 1- 50 -> Mała liczba
//        // 50 -> 100 -> Duża liczba
//
//
//        if (liczba < 50) {
//            System.out.println("Mała liczba");
//        }else if(liczba < 75) {
//            System.out.println("Duża liczba");
//        }else{
//            System.out.println("Gigantyczna liczba");
//        }


       // String primaryText = "fewfewf rg43fr fdrefre";


//        Random random = new Random();
//
//        int liczba = random.nextInt(3)+1;
//        int liczba2 = random.nextInt(3)+1;
//
//        System.out.println("Liczba1: "+ liczba+"\nLiczba2: "+liczba2);
//
//
//
//        int max = liczba > liczba2 ? liczba : liczba2;
//
//        if(liczba > liczba2){
//            max=liczba;
//        }else{
//            max=liczba2;
//        }
//        System.out.println("Największa: "+max);


        Random random = new Random();
        int number = random.nextInt(6)+1;




        switch(number){

                case 1:
                case 2:
                    System.out.println("Jeden lub dwa");
                    break;
                case 3:
                     System.out.println("Trzy");
                    break;
                case 4:
                    System.out.println("Cztery");
                    break;
                case 5:
                    System.out.println("Pięć");
                    break;
                default:
                     System.out.println("Nie wiadomo");
                     break;
        }









    }

}
