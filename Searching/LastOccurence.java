class LastOccurence{
	public static int findLastOccurence(int[] arr,int k){
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(arr[mid]>k){
				end=mid-1;
			}
			else if(arr[mid]<k){
				start=mid+1;
			}
			else{
				if(mid==arr.length-1 || arr[mid+1]!=arr[mid]){
					return mid;
				}
				else{
					start=mid+1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// int[] arr={5,10,10,15,15,15};
		int[] arr={5,10,10,15,20,20,20,25};
		int k=25;
		System.out.println(findLastOccurence(arr,k));
	}
}