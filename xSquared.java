import java.util.List;
import java.util.ArrayList;

public class xSquared {
    public static double xsquared(int numRuns, int[] B){
        int[] C = new int[B.length];
        for(int i = 0; i < C.length; i++){
            C[i] = numRuns / B.length;
        }
        double x2 = 0;
        for(int k = 0; k < C.length; k++){
            x2+=((B[k]-C[k])^2)/(double)C[k];
        }   
        return x2;
    }
}
