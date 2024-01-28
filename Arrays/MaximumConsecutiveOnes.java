class MaximumConsecutiveOnes{
	
	public static int maxConsecutiveOnes(int[] arr){
		int maxCount=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1){
				count++;
			}
			else{
				count=0;
			}
			if(count>maxCount){
				maxCount=count;
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {
		int[] arr={0,1,1,0,1,0};
		System.out.println(maxConsecutiveOnes(arr));
	}
}