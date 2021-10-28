package day04;

import java.util.ArrayList;
import java.util.List;

public class Prison {
    List<Boolean> cell;

    public Prison(int n){
        cell = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            cell.add(false);
        }
    }

    public void openFreeCells(){
        for (int i = 0; i < cell.size(); i++) {
            for (int j = i; j < cell.size(); j+=i+1) {
                cell.set(j, !cell.get(j));
            }
        }
    }

    public List<Integer> getFreeCells(){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < cell.size(); i++) {
            if(cell.get(i)){
                result.add(i+1);
            }
        }
        return result;
    }
}
