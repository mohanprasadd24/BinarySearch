

public class ceilingletters {
    public static void main(String[] args) {
        char[] arr ={'c','e','l','x','z'};
        char target = 'x';
        int ans= ceilletter(arr,target);
        System.out.print(ans);
    }
    public static int ceilletter(char[] arr,char target){
        int start = 0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}
