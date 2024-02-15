class SearchInRotatedIndex {
    public static int search(int[] nums, int target) {
        //without using recursion
        // int start=0;
        // int end=nums.length-1;
        // while(start<=end){

        //     int mid=start+(end-start)/2;

        //     if(nums[mid]==target){
        //         return mid;
        //     }
        //     else if(nums[start]<=nums[mid]){
        //         if( nums[start]<=target && nums[mid]>target){
        //             end=mid-1;
        //         }
        //         else{
        //             start=mid+1;
        //         }
        //     }
        //     else if ( nums[mid]<target && nums[end]>=target){
        //         start=mid+1;
        //     }
        //     else{
        //         end=mid-1;
        //     }
        // }
        // return -1;

        //with recursion

        return findIndex(nums,0,nums.length-1,target);
    }

    public static  int findIndex(int[] arr,int startIndex,int endIndex,int target){
        if(startIndex>endIndex){
            return -1;
        }
        int mid=startIndex+(endIndex-startIndex)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[startIndex] <= arr[mid]){
            if(arr[startIndex]<=target && arr[mid]>target){
                return findIndex(arr,startIndex,mid-1,target);
            }
            else{
                return findIndex(arr,mid+1,endIndex,target); 
            }
        }
        if (arr[mid]<target && arr[endIndex]>=target){
            return findIndex(arr,mid+1,endIndex,target);
        }
       return findIndex(arr,startIndex,mid-1,target);

    }

    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
}