import java.util.*;

class Solution {
    public int solution(int[] A) {
        if(A.length<=1) return 0;
        
        int max_profit_when_sold_by_the_day = A[0]-A[0];
        int min_bought_price = A[0];
        for(int i=1; i<A.length; i++){
            max_profit_when_sold_by_the_day = Math.max(max_profit_when_sold_by_the_day, A[i]-min_bought_price);
            min_bought_price = Math.min(min_bought_price, A[i]);
        }
        
        return max_profit_when_sold_by_the_day;
    }
}
