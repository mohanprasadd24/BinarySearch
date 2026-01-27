public class floor {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,7,8,9,12};
        int target=2;
        System.out.print(floorbs(arr,target));
    }
    static int floorbs(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
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
        return end;
    }
}
