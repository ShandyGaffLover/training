// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        // 配列の各値の出現回数を記録する
        Map<Integer, Integer> occurance = create_occurance(A);
        
        // 出現回数が1である数を返却する
        for(Integer key: occurance.keySet()){
            if(occurance.get(key)==1){
                return key;
            }
        }
        // 出現回数が1である数がない場合はエラー。ここでは-1を返却する
        return -1;
    }
    
    private Map<Integer, Integer> create_occurance(int[] A){
        Map<Integer, Integer> occurance = new HashMap<>();
        for(int num : A){
            if(!occurance.containsKey(num)){
                occurance.put(num, 0);
            }
            occurance.put(num, occurance.get(num) + 1);
        }
        return occurance;
    }
}