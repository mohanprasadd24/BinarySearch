public class rotatedarraywithduplicates {
    public static void main(String[] args) {
        int[] arr={2,9,2,2,2};
        int target=2;
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
            ans =binarysearch(arr,target,pivot+1,arr.length-1);
        }
        return ans;
    }
    static int pivot(int[]arr){
        int start =0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if (mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(mid<end&&arr[mid]>arr[mid+1] ){
                return mid;
            }
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid]||arr[start]==arr[mid]&& arr[mid]> arr[end]){
                start=mid+1;

            }
            else{
                end=mid-1;
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

//case1 -if mid<start&&arr[mid]<arr[mid-1] return mid-
//
//case2- if mid<end&&arr[mid]>arr[mid+1] return mid
//
//case3- if mid<end&&arr[mid]>arr[mid+1] becase if mid is samller than start then the pivot must lie from start to mid-1
//so end=mid-1
//
//case4 - if arr[mid]>arr[start] then the pivot must lie between mid=1 and end
//so start=mid+1
//
//return -1 if all four fails (usally not possible)




//with duplicates
// if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
//        if(arr[start]>arr[start+1]){
//        return start;
//                }
//start++;
//
//        if(arr[end]<arr[end-1]){
//        return end-1;
//        }
//end--;
//        }
//        else if(arr[start]<arr[mid]||arr[start]==arr[mid]&& arr[mid]> arr[end]){
//start=mid+1;
//
//        }
//        else{
//end=mid-1;
//        }
//        }
