class CountOccurencesInSortedArray{
	
	public static int countOccurence(int[] arr,int k){
		int firstOccurence=findFirstOccurence(arr,k);
		int lastOccurence=findLastOccurence(arr,k);
		return lastOccurence-firstOccurence+1;

	}
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
		// int[] arr={10,20,20,20,30,30};
		int[] arr={10,20,20,20,30,30,30};
		int k=30;
		System.out.println(countOccurence(arr,k));
	}
}