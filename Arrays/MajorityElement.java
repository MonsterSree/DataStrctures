class MajorityElement{
	public static int majorityElement(int[] arr){
		int element=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(count==0){
				element=arr[i];
				count++;
			}
			else{
				if(element==arr[i]){
					count++;
				}
				else{
					count--;
				}
			}
		}
		return element;
	}
	public static void main(String[] args) {
		int[] arr={1,2,1,3,1};
		System.out.println(majorityElement(arr));
	}
}