import java.util.List;
import java.util.ArrayList;

public class LCG {
    public static int[] linearCongruenceGenerator(int m, int a, int c, int seed, List<Integer> arr ){
        arr.add(seed);
        for(int i = 1; i <= m; i++){
            if(arr.contains((a*arr.get(i-1)+c)%m)){
                break;
            }
            arr.add((a*arr.get(i-1)+c)%m);
        }
        int[] A = new int[arr.size()];
        for(int j = 0; j < arr.size(); j++){
            A[j] = arr.get(j);
        }
        return A;
    }

    public static int[] countOccurences(int m, int a, int c, int seed, List<Integer> arr,int numRuns ){
        int[] A = LCG.linearCongruenceGenerator(m, a, c, seed, arr);
        int[] B = new int[A.length];
        for(int i = 0; i < A.length; i++){
            B[i] = 0;
        }
        for(int i = 0; i < numRuns; i++){
            B[] ++;
        }
        return B;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(); 
        // arr = middleSquare.midSquare(4323,arr,4323);
        // int[] arr1 = new int[arr.size()];
        // for(int i = 0; i < arr.size(); i++){
        //     arr1[i] = arr.get(i);
        // }
        // int[] histoArray = histogram(arr1, 9999);
        // for(int i = 0; i < histoArray.length; i++){
        //     if(histoArray[i]!= 0)
        //     System.out.println(i + " appeared " + histoArray[i] + " times" );
        // }
        // int[] A= LCG.linearCongruenceGenerator(509, 35, 160, 7, arr);
        int[] A = LCG.countOccurences(16, 5, 3, 7, arr,100);
        // int[] A= LCG.countOccurences(509, 35, 160, 7, arr,1000);
        
        for(int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
        System.out.println("length is " + A.length);
    }
    
    
}

