class Find1SCount{
	public static int find1SCount(int[] arr){
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(arr[mid]<1){
				start=mid+1;
			}
			else{
				if(mid==0 || arr[mid-1]!=arr[mid]){
					return arr.length-mid;
				}
				else{
					end=mid-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr={0,0,0,0,1,1,1};
		/*
		start=0,end=7;
		mid=3;

		*/
		int[] arr1={0,0,0,1};
		System.out.println(find1SCount(arr));
		System.out.println(find1SCount(arr1));

	}
}