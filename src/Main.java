//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr={4,5,7,9,12,16,20,24};
        int target=20;
        int ans = binarysearch(arr,target);
        System.out.print(ans);

    }
    static int binarysearch(int[]arr ,int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)-1;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}