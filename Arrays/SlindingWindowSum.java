class SlindingWindowSum{
	public static int maxWindowSum(int[] arr,int k){
		int max=Integer.MIN_VALUE;
		int sum=0;
		int left=0;
		int right=0;
		while(right<arr.length){
			sum=sum+arr[right];
			if(right-left+1==k){
				if(sum>max){
					max=sum;
				}
				sum=sum-arr[left];
				left++;
			}
			right++;
		}
		return max;
	}
	
	public static void main(String[] args) {
		// int[] arr={1,8,30,-5,20,7};
		int[] arr={5,-10,6,90,3};
		int k=2;
		System.out.println(maxWindowSum(arr,k));
	}
}