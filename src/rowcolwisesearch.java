import java.util.Arrays;

public class rowcolwisesearch {
    public static void main(String[] args) {
        int [][] arr= {
                {1,2,7},
                {3,4,6},
                {5,8,9},
        };
        int target=4;
        String ans= Arrays.toString(search(arr,target));
        System.out.print(ans);
    }
    static int[] search(int[][] arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<arr.length&&end>=0){
            if(arr[start][end]==target){
                return new int[]{start,end};
            } else if (arr[start][end]>target) {
                end--;
            }
            else {
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
