

public class ceilingletters {
    public static void main(String[] args) {
        char[] arr ={'c','e','l','x','z'};
        char target = 'z';
        char ans= ceilletter(arr,target);
        System.out.print(ans);
    }
    public static char ceilletter(char[] arr,char target){
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
        if(start==arr.length){
            return '\0';   // null character

        }
        return  arr[start];
    }
}
//return letters[start%letters.length]; if no more letter is greater than the target it returns the first char