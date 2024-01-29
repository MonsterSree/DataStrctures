class MaxLengthEvenOddSubArray{
	public static int maxLengthEvenOddSubArray(int[] arr){
		if(arr.length<2){
			return arr.length;
		}
		int left=0;
		int count=1;
		int maxResult=0;
		int right=1;
		while(right<arr.length){
			if((arr[left]%2==0 && arr[right]%2!=0) || (arr[left]%2!=0 && arr[right]%2==0)){
				count++;
			}
			else{
				count=1;
			}

			if(count>maxResult){
				maxResult=count;
			}
			left++;
			right++;
		}
		return maxResult;
	}
	public static void main(String[] args) {
		// int[] arr={10,12,14,7,8};
		// int[] arr={7,10,13,14};
		int[] arr={10,12,8,4};
		System.out.println(maxLengthEvenOddSubArray(arr));
	}
}