class InsertionSort{
	public static void sort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;

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