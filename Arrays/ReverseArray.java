class ReverseArray{
	public static void reverseArray(int[] arr,int start,int end){
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int[] arr={1,2,3,4};
		reverseArray(arr,0,arr.length-1);
		for(int element:arr){
			System.out.print(element+",");
		}
	}
}