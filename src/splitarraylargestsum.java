public class splitarraylargestsum {
    public static void main(String[] args) {
        int []arr={7,2,5,8,10};
        int m=2;
        int ans=splitarray(arr,m);
        System.out.println(ans);
    }
    static int splitarray(int[] arr,int m) {
       int start=0;
       int end=0;
        for (int j : arr) {
            start = Math.max(start, j);
            end += j;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            //split array
            int sum=0;
            int pieces=1;
            for(int num:arr){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces<=m){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
}
