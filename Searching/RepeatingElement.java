class RepeatingElement{

	public static int findRepeatingElement(int[] arr){
		int slow=arr[0];
		int fast=arr[0];

		do{
			slow=arr[slow];
			fast=arr[arr[fast]];
		}while(slow!=fast);

		slow=arr[0];
		while(slow!=fast){
			slow=arr[slow];
			fast=arr[fast];
		}
		return slow;
	}
	
	public static void main(String[] args) {
		int[] arr={1,3,2,4,3,3};
		System.out.println(findRepeatingElement(arr));
	}
}