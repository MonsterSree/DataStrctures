class MaximumCircularSumSubArray{
	
	public static int maximumCircularSumSubArray(int[] arr){

		int normalArrayMaxSubSum=kadensAlgo(arr);
		if(normalArrayMaxSubSum<0){
			return normalArrayMaxSubSum;
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			arr[i]=-arr[i];
		}
		int circularArrayMaxSubSum=sum+kadensAlgo(arr);
		return Math.max(normalArrayMaxSubSum,circularArrayMaxSubSum);

	}
	public static int kadensAlgo(int[] arr){
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			if(sum>max){
				max=sum;
			}
			if(sum<0){
				sum=0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr={8,-4,3,-5,4};
		System.out.println(maximumCircularSumSubArray(arr));
	}
}