import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main { 
  static void printHistogram(int[] arr, int n) {
    int maxEle = Arrays.stream(arr).max().getAsInt();
    for (int i = maxEle; i >= 0; i--) {
      System.out.format("%2d | ", i);
       
      // if array of element is greater
      // then array it print x
      for (int j = 0; j < n; j++) {
        if (arr[j] >= i) {
          System.out.print(" x ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 0; i < n + 3; i++) {
      System.out.print("---");
    }
 
    System.out.println();
    System.out.print("     ");
 
    for (int i = 0; i < n; i++) {
      System.out.format("%2d ", arr[i]);
    }
  }

  public static int[] histogram(int[] a, int m){
    int[] histoArray = new int[m];

    for(int index = 0; index < a.length; index++){
        int i = a[0];
        histoArray[i] = histoArray[i] + 1;
    }
    return histoArray;
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
    int[] A = LCG.linearCongruenceGenerator(16, 5, 3, 7, arr);
    for(int i = 0; i < A.length; i++){
        System.out.println(A[i]);
    }
}

}


    
