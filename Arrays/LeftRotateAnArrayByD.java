class LeftRotateAnArrayByD{
	public static void leftrotateByDtimes(int[] arr,int d)
	{
		//rotating upto d
		rotate(arr,0,d-1);
		//rotating from d to n-1
		rotate(arr,d,arr.length-1);
		//rotating from 0,n-1
		rotate(arr,0,arr.length-1);
	}
	public static void rotate(int[] arr,int start, int end){
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int d=2;
		leftrotateByDtimes(arr,d);
		for(int element:arr){
			System.out.print(element+",");
		}
	}
}