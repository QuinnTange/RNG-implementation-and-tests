import java.util.List;

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
}

