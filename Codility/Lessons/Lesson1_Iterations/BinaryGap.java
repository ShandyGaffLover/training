// you can also use imports, for example:
import java.util.*;
import java.lang.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {

        String bin = Integer.toBinaryString(N);
        List<String> list = Arrays.asList(bin.split(""));
        Iterator<String> iterator = list.iterator();
        int dest = 0;
        int count = 0;
        while(iterator.hasNext()){
            String s = iterator.next();
            if("0".equals(s)){
                count++;
                continue;
            }
            if(count>dest){
                dest=count;
                count=0;
            }
        }
        return dest;
    }
}