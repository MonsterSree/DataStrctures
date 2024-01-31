class BinarySearch{
	public static int getPosition(int[] arr,int k){
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			int mid=((end-start)/2)+start;
			if(arr[mid]>k){
				end=mid-1;
			}
			else if(arr[mid]<k){
				start=mid+1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	public static int getPositionRecursive(int[] arr,int k,int start,int end){
		if(start>end){
			return -1;
		}
		int mid=start+(end-start)/2;
		if(arr[mid]==k){
			return mid;
		}
		if(arr[mid]>k){
			return getPositionRecursive(arr,k,start,mid-1);
		}
		else{
			return getPositionRecursive(arr,k,mid+1,end);
		}

	}
	public static void main(String[] args) {
		int[] arr={10,20,30,40,50,60};
		int k=50;
		System.out.println(getPosition(arr,k));
		System.out.println(getPositionRecursive(arr,k,0,arr.length-1));

	}
}