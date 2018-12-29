import java.util.*;

class Solution {
    public int solution(int[] A) {
        if(A.length<=3){
            return 0;
        }
        int max_first_slice_when_y_equals_to_i_minus_1 = 0;
        int max_double_slice_when_z_equals_to_i = 0;
        int dest = 0;
        for(int i=3; i<A.length; i++){
            max_first_slice_when_y_equals_to_i_minus_1
            = Math.max(max_first_slice_when_y_equals_to_i_minus_1+A[i-2], 0);
            max_double_slice_when_z_equals_to_i
            = Math.max(max_double_slice_when_z_equals_to_i+A[i-1], max_first_slice_when_y_equals_to_i_minus_1);
            dest = Math.max(dest, max_double_slice_when_z_equals_to_i);
        }
        
        return dest;
    }
}
