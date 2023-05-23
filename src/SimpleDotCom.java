import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    public String checkYourself(String stringGuess){

        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for (int i = 0; i < locationCells.length; i++) {
            if(guess == locationCells[i]){
                result = "Попал";
                locationCells[i] = -1;
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
