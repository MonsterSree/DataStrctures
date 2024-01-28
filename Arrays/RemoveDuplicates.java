class RemoveDuplicates{
	public static void remvoeDuplicates(int[] arr){
		int res=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[i-1]){
				arr[res++]=arr[i];
			}
		}
		for(int i=0;i<res;i++){
			System.out.print(arr[i]+",");
		}
	}

	public static void main(String[] args) {
		int[] arr={1,2,2,2,4,4,5,6,7,7};
		remvoeDuplicates(arr);
	}
}
