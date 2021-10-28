package day04;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public int numberOfDivisors(int n){
        int result = 0;
        for (int i = 1; i <= n ; i++) {
            if(n%i == 0){
                result++;
            }
        }
        return result;
    }

    public boolean letGo(int n){
        return numberOfDivisors(n)%2 == 1;
    }

    public List<Integer> decision(int max){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            if(letGo(i)){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 100;
        boolean[] cell = new boolean[n];
        List<Integer> go = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j+=i+1) {
                cell[j] = !cell[j];
            }
        }

        for (int i = 0; i < n; i++) {
            if(cell[i]){
                go.add(i+1);
            }
        }

        System.out.println(go);

        System.out.println(new Program().decision(100));
    }
}
