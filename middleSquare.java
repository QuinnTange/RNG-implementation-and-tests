
import java.util.List;

public class middleSquare {
    public static List<Integer>  midSquare(int x, List<Integer> arr,int seed){
        x *= x;
        if (arr.contains(x)){
            return arr;
        }
        String tempStr = Integer.toString(x);
        if(tempStr.length() == 8){
            tempStr = tempStr.substring(2,6);
        }
        else if(tempStr.length() == 7){
            tempStr = tempStr.substring(1,5);
        }
        else return arr;
        int tempInt = Integer.parseInt(tempStr);
        arr.add(tempInt);
        return midSquare(tempInt, arr, seed);
    }
}



