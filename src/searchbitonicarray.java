public class searchbitonicarray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,4,3,1};
        int target=3;
        int peak=peak(arr);
        int ans=orderagnostic(arr,target,0,peak);
        if(ans==-1){
            ans=orderagnostic(arr,target,peak,arr.length-1);
        }
        System.out.print(ans);
    }
    static int peak(int[]arr){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<end){
            mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else {
                end=mid;
            }

        }
        return start;
    }
    static int orderagnostic(int[]arr,int target,int start,int end){
        boolean isasc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isasc){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }

        }

        return -1;
    }
}
