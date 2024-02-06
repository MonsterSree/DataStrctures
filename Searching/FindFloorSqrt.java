class FindFloorSqrt{
	public static int findfloorSqrt(int k){
		int start=0;
		int end=k/2;
		while(start<=end){
			int mid=start+(end-start)/2;
			if((mid*mid <= k) && ((mid+1)*(mid+1)>k)){
				return mid;
			} 
			else if(mid*mid < k){
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int k=25;
		System.out.println(findfloorSqrt(k));
	}
}