class SearchInInfinateArray{
	public static int findIndex(int[] arr,int k){
		if(arr[0]==k){
			return 0;
		}
		int i=1;
		while(arr[i]<k){
			i=i*2;
		}
		if(arr[i]==k){
			return i;
		}
		else{
			return getPosition(arr,k,i/2+1,i-1);
		}
	}
	public static int getPosition(int[] arr,int k,int start,int end){
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
	public static void main(String[] args) {
		//here array length will be in milllions;
		int[] arr={1,10,15,20,50,60,80,100};
		int k=50;
		System.out.println(findIndex(arr,k));
	}
}