package baseball;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Baseball {
    private ArrayList<Integer> baseball = new ArrayList<>();

    public boolean parseBaseball(String userInput){
        if(Validation.validateInput(userInput)){
            baseball.clear();
            for(char ball : userInput.toCharArray()){
                baseball.add(Character.getNumericValue(ball));
            }
            return true;
        }
        return false;
    }
    public ArrayList<Integer> getBaseballs(){
        return baseball;
    }
}
