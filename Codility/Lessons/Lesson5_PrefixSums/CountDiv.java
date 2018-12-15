import java.util.*;

class Solution {
    public int solution(int A, int B, int K) {

        int start = A / K;
        if(A%K!=0){
            start += 1;
        }
        int end = B / K;
        return end - start + 1;

    }
}
