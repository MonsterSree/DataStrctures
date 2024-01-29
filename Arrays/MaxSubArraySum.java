class MaxSubArraySum{
	//Kadens Algoritham
	public static int maxSubArraySum(int[] arr){
		int result=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			if(sum>result){
				result=sum;
			}
			if(sum<0){
				sum=0;
			}
			
		}
		return result;
	}
	public static void main(String[] args) {
		// int[] arr={2,3,-8,7,1,2,3};
		int[] arr={-1,-2,-3};
		System.out.println(maxSubArraySum(arr));
	}
}