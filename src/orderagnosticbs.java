public class orderagnosticbs {
    public static void main(String[] args) {
        int[] arr={40,25,20,13,10,8,5,2};
        int target= 2;
        int ans= orderagnostic(arr,target);
        System.out.print(ans);
    }
    static int orderagnostic(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
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
