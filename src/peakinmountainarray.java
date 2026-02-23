public class peakinmountainarray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,9};
        int ans=binarysearch(arr);
        System.out.println(ans);
    }
    static int binarysearch(int[]arr){
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
}
