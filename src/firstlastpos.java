import java.util.Arrays;

public class firstlastpos {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,7,7,9,12};
        int target=7;
        System.out.print(Arrays.toString(fislastbs(arr,target))) ;
    }

    private static int[] fislastbs(int[] arr, int target) {
        int[] ans={-1,-1};
        int first=binarysearch(arr,target,true);
        int end=binarysearch(arr,target,false);
        ans= new int[]{first, end};
        return ans;
    }

    private static int  binarysearch(int[] arr,int target,boolean firstpos) {
        int ans= -1;
        int start=0;
        int end=arr.length-1;
        boolean fistpos;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(mid<target){
                start=mid+1;
            }
            else if(mid>target) {
                end=mid-1;
            }
            else {
                ans=mid;

                if(fistpos){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }

}
