package godeokhwan.test231210;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 요격시스템
 *
 */
public class Programmers01 {

    public static int solution(int[][] targets) {
        int answer = 0;
        // end Point로 정렬
        List<int[]> targetList = Arrays.stream(targets).sorted((t1, t2) -> t1[1] - t2[1])
                .collect(Collectors.toList());

        int temp = 0;
        for (int[] t : targetList) {
            if (temp <= t[0]) { // start 포인트와 이전 end 포인트 사이에 터지는 구간
                temp = t[1]; // 이전 end 포인트에서 다음 end포인트로 이동
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[][] targets1 = new int[][]{{4,5}, {4,8}, {10,14}, {11,13}, {5,12}, {3,7}, {1,4}};
        System.out.println(solution(targets1));
    }
}
