class BubbleSort{

	public static void sort(int[] arr,int row,int column){
		if(row==0){
			return;
		}
		if(column==row){
			sort(arr,row-1,0);
			return;
		}
		if(arr[column]<arr[column+1]){
			int temp=arr[column];
			arr[column]=arr[column+1];
			arr[column+1]=temp;
		}

		sort(arr,row,column+1);
	}
	
	public static void main(String[] args) {
		int[] arr={3,4,7,0,7,9,3,4,1,2};
		sort(arr,arr.length-1,0);
		for(int i:arr){
			System.out.print(i+",");
		}
	}
}