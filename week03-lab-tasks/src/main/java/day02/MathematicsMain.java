package day02;

import java.util.ArrayList;
import java.util.List;

public class MathematicsMain {
    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        List<Integer> primes = new ArrayList<>();

        for(int i=0; i<100; i++){
            if(mathematics.isPrime(i)){
                primes.add(i);
            }
        }

        System.out.println(primes);
    }
}
