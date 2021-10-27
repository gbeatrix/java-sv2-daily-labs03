package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret = random.nextInt(1, 101);
        int tip = 0;
        System.out.println("Gondoltam egy számra.");
        for(int i=0; i<6 && tip!=secret; i++){
            System.out.print("Mi a tipped? ");
            tip = scanner.nextInt();
            if(tip>secret){
                System.out.println("A gondolt szám kisebb.");
            }
            if(tip<secret){
                System.out.println("A gondolt szám nagyobb.");
            }
            if(tip==secret){
                System.out.println("Eltaláltad!");
            }
        }
        if(tip==secret){
            System.out.println("Nyertél");
        } else {
            System.out.println("Nem nyertél");
        }
    }
}
