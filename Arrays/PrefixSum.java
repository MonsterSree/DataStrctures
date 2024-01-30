class PrefixSum{
	static int[] result;
	public static void preProcess(int[] arr){
		result=new int[arr.length];
		result[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			result[i]=arr[i]+result[i-1];
		}
	}
	public static int getSum(int left,int right){
		if(left==0){
			return result[right];
		}
		else{
			return result[right]-result[left-1];
		}
	}

	public static void main(String[] args) {
		int[] arr={2,8,3,9,6,5,4};
		preProcess(arr);
		System.out.println(getSum(0,2));
		System.out.println(getSum(1,2));

	}
}