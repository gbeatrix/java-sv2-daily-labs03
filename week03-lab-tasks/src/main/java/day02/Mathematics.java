package day02;

import java.util.ArrayList;
import java.util.List;

public class Mathematics {
    public boolean isPrime(int number){
        if(number<2){
            return false;
        }
        boolean result = true;
        for(int i=2; i<= Math.sqrt(number); i++){
            if(number%i == 0){
                result = false;
            }
        }
        return result;
    }

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
