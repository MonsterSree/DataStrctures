class EquilibriumPoint{
	
	public static int equilibriumPoint(int[] arr){
		int totalSum=0;
		for(int i=0;i<arr.length;i++){
			totalSum+=arr[i];
		}
		int smallSum=0;
		for(int i=0;i<arr.length;i++){
			totalSum-=arr[i];
			if(smallSum==totalSum){
				return i;
			}
			smallSum+=arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr={3,4,8,-9,9,7};
		System.out.println(equilibriumPoint(arr));
	}
}