class FirstOccurence{
	public static int findFirstOccurence(int[] arr,int k){
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
				if(mid==0 || arr[mid-1]!=arr[mid]){
					return mid;
				}
				else{
					end=mid-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// int[] arr={5,10,10,15,15,15};
		int[] arr={5,10,10,15,20,20,20};
		int k=20;
		System.out.println(findFirstOccurence(arr,k));
	}
}