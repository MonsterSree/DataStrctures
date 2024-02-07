class BubbleSort{
	public static void sort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
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