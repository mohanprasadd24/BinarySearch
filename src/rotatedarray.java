public class rotatedarray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=1;
        int pivot=pivot(arr);
        int ans=ans(arr,target);
        System.out.println(pivot);
        System.out.println(ans);

    }
    static int ans(int[]arr ,int target){
        int pivot=pivot(arr);
        int ans =binarysearch(arr,target,0,pivot);
        if(ans!=-1){
            return ans;
        }
        else{
            ans =binarysearch(arr,target,pivot,arr.length-1);
        }
        return ans;
    }
    static int pivot(int[]arr){
        int start =0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if (mid<start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(mid<end&&arr[mid]>arr[mid+1] ){
                return mid;
            }
            else if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;

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
