class MovesZerosToEnd{
	
	public static void moveZerosToEnd(int[] arr){
		int left=-1;
		int start=0;
		while(start<arr.length){
			if(arr[start]==0 && left==-1){
				left=start;
			}

			if(arr[start]!=0 && left!=-1){
				int temp=arr[left];
				arr[left]=arr[start];
				arr[start]=temp;
				left++;
			}
			start++;
		}
	}

	public static void main(String[] args) {
		// int[] arr={1,2,3,4,0,5};
		int[] arr={10,5,0,0,8,0,9,0};
		moveZerosToEnd(arr);
		for(int element:arr){
			System.out.print(element+",");
		}
	}
}