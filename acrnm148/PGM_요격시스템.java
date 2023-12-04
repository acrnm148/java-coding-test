import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] targets) {
        // e 오름차순 정렬
        Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);
        
        int ans = 0;
        int x = 0;
        for (int[] target : targets) {
            if (x <= target[0]) {
                x = target[1];
                ans++;
            }
        }
        
        return ans;
    }
}