import java.util.*;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int having_maximum_one = 0;
        int increasing_one = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]==N+1){
                Arrays.fill(counters, counters[having_maximum_one]);
                having_maximum_one = 0;
                continue;
            }
            increasing_one = A[i]-1;
            counters[increasing_one]+=1;
            if(counters[increasing_one]>counters[having_maximum_one]){
                having_maximum_one = increasing_one;
            }
        }
        return counters;
    }
}
