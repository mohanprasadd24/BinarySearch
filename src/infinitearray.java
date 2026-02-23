public class infinitearray {
    public static void main(String[] args) {
       int[] arr={3,6,9,12,15,22,28,33,54};
       int target=15;
       int ans=ans(arr,target);
        System.out.println(ans);
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
            }
        return binarysearch(arr,target,start,end)  ;
    }
    static int binarysearch(int[]arr ,int target,int start,int end){
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
        return -1;
    }
}
