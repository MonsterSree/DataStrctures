class SelectionSort{
	public static void sort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[] args) {
		int[] arr={10,8,20,5};
		sort(arr);
		for(int i:arr){
			System.out.print(i+",");
		}
	}
}