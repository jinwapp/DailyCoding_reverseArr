//문제: 배열을 입력받아 순서가 뒤집힌 배열을 리턴해야 합니다.
//주의사항:
//        함수 reverseArr는 재귀함수의 형태로 작성합니다.
//        반복문(for, while) 사용은 금지됩니다.
//        입력받은 배열은 함수의 호출 뒤에도 처음 상태를 유지해야 합니다(immutability).
//        빈 배열은 빈 배열 그대로를 리턴해야 합니다.
//        입출력 예시
//입출력 예시
//        int[] output = reverseArr([1, 2, 3]);
//        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]

import java.util.Arrays;

public class DailyCoding_reverseArr {
    public static void main(String[] args) {
        // 재귀함수 형태로 작성한다.

        Solution a = new Solution();
        int[]arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(a.reverseArr(arr)));
    }
}

class Solution{
    public int[] reverseArr(int[] arr){
        //todo

        if (arr.length == 0) {
            return new int[] {};
        }

        int[] head = Arrays.copyOfRange(arr,arr.length-1,arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr,0,arr.length-1));


        int[] result = new int[head.length+tail.length];
        System.arraycopy(head,0,result,0,head.length);
        System.arraycopy(tail,0,result,head.length,tail.length);

        System.out.println(Arrays.toString(result));

        return result;
    }
}