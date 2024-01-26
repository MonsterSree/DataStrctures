class OneOddOccuring{

	public static int oddOccuring(int[] arr){
		int result=arr[0];
		for(int i=1;i<arr.length;i++){
			result=result ^ arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr={4,3,4,4,4,5,5};
		System.out.println(oddOccuring(arr));
	}
}