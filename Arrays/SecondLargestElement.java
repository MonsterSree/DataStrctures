class SecondLargestElement{
	
	public static int findSecondLargetElement(int[] arr){
		int largest=arr[0];
		int secondLargest=-1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>largest){
				secondLargest=largest;
				largest=arr[i];
			}
			else{
				if(secondLargest<arr[i]  && arr[i]!=largest){
					secondLargest=arr[i];
				}
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		// int[] arr={10,5,8,20};
		// int[] arr={20,10,20,8,12};
		// int[] arr={10,10,20,8,12};
		// int[] arr={10,5,3,2,1};
		// int[] arr={10,15,13,12,11};
		// int[] arr={10,15,16,17,18};
		int[] arr={10,10,10,10,10};
		System.out.println(findSecondLargetElement(arr));
	}
}