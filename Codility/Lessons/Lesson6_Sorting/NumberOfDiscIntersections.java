import java.util.*;

class Solution {
    
    static final int COL_CENTER=0;
    static final int COL_EDGE=1;
    static final int MAX_INTERSECTING_PAIRS = 10000000;
    
    public int solution(int[] A) {

        // 変換統治法：数直線と各円の交点を楔Wedgeとして保存する
        int[][] wedges = createWedges(A);
        
        // Wedgeをその位置でソートする。Ref: https://teratail.com/questions/80128
        Arrays.sort(wedges, (a, b) -> Integer.compare(a[COL_EDGE], b[COL_EDGE]));
        
        // 数直線をなぞり、同じ円由来のWedge間に存在するWedgeの数を加算する。
        Map<Integer, Integer> map = new HashMap<>();
        int dest = 0;
        for(int[] wedge: wedges){
            if(!map.containsKey(wedge[COL_CENTER])){
                map.put(wedge[COL_CENTER], wedge[COL_EDGE]);
                continue;
            }
            // 自身を除外し、そのときまで通過したWedgeの数を加算する
            map.remove(wedge[COL_CENTER]);
            dest += map.size();

            if(dest>MAX_INTERSECTING_PAIRS){
                return -1;
            }
        }
        return dest;
    }
    
    private int[][] createWedges(int[] A){
        int[][] wedges = new int[2*A.length][2];
        for(int i=0; i<A.length; i++){
            wedges[i][COL_CENTER]=i;
            wedges[i][COL_EDGE]=i-A[i];
            wedges[i+A.length][COL_CENTER]=i;
            wedges[i+A.length][COL_EDGE]=i+A[i];
        }
        return wedges;
    }
}
