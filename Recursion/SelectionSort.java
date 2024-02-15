class SelectionSort{
	public static void sort(int[] arr,int row,int column,int maxIndex){
		if(row==0){
			return;
		}
		if(row==column-1){
			int temp=arr[row];
			arr[row]=arr[maxIndex];
			arr[maxIndex]=temp;
			sort(arr,row-1,0,0);
			return;
		}

		if(arr[column]>arr[maxIndex]){
			maxIndex=column;
		}

		sort(arr,row,column+1,maxIndex);
	}
	public static void main(String[] args) {
		int[] arr={4,3,2,8,1,0,9};
		sort(arr,arr.length-1,0,0);
		for(int i:arr){
			System.out.print(i+",");
		}
	}
}