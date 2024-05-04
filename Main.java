import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main { 

    public static int[] listToArr(List<Integer> arr){
        int[] A = new int[arr.size()];
        for(int j = 0; j < arr.size(); j++){
            A[j] = arr.get(j);
        }
        return A;
    }
   
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<Integer>(); 
    arr = middleSquare.midSquare(4323,arr,4323);
    int[] middleSquareA = listToArr(arr);
    int[] LCGA1 = LCG.linearCongruenceGenerator(16, 5, 3, 7, arr);
    int[] LCGA2 = LCG.linearCongruenceGenerator(509, 35, 160, 7, arr);
    for(int i = 0; i < middleSquareA.length; i++){
        System.out.println(middleSquareA[i]);
    }
}

}


    
