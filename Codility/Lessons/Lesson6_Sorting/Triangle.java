import java.util.*;

class Solution {
    public int solution(int[] A) {
        /* 
        3つのうちいずれか1つ以上が0以下ならば、not triangularである。 
        （残りの2つの内より小さい値にその数値を足した場合を考えれば証明できる）
        よって3つすべてが正の数である場合を考える
        */
        
        /*
        a>0, b>0, c>0, a<b<cに対し
        a,b,cがtriangularではない⇒a+b<=c
        が成り立つ（対偶で証明できる）
        したがってz<a<b<c<dに対し
        a,b,cがtriangularではない
        ⇒z,b,cもtriangularではない かつ a,b,eもtriangularではない
        */
        
        /*
        よってソート後に隣接する3項を比較すれば十分である
        */
        if(A.length<3){
            return 0;
        }
        Arrays.sort(A);
        for(int i=0; i<A.length-2; i++){
            if(isTriangular(A[i], A[i+1], A[i+2])){
                return 1;
            }
        }
        return 0;
        
    }
    private boolean isTriangular(int a, int b, int c){
        return (a+b>c) && (b+c>a) && (c+a>b); 
    }
}
