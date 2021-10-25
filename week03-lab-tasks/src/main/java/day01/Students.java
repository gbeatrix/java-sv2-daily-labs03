package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private List<Integer> heightList = new ArrayList<>();

    public void addHeight(int height){
        heightList.add(height);
    }

    public boolean isHeightsIncreasing(){
        boolean result = true;
        for(int i=1; i<heightList.size(); i++){
            if(heightList.get(i)<heightList.get(i-1)){
                result = false;
            }
        }
        return result;
    }
}
