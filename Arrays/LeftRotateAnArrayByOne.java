class LeftRotateAnArrayByOne{
	public static void leftRotateAnArray(int[] arr){
		for(int i=1;i<arr.length;i++){
			int temp=arr[i-1];
			arr[i-1]=arr[i];
			arr[i]=temp;
		}

	}
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		leftRotateAnArray(arr);
		for(int element:arr){
			System.out.print(element+",");
		}
	}
}