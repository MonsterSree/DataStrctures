class FindPeakElement{
    public static int findPeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==arr.length-1 ||  arr[mid]>=arr[mid+1])){
                return mid;
            }
            else if(mid>0 && arr[mid]<=arr[mid-1]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,6,3,2};
        System.out.println(findPeakElement(arr));
    }
}