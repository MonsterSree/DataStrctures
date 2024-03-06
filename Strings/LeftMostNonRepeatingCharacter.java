class LeftMostNonRepeatingCharacter{

	public static int findLeftMostNonRepeatingCharacter(String input){
		int[] arr=new int[26];
		for(int i=0;i<input.length();i++){
			arr[input.charAt(i)-97]++;
		}
		for(int i=0;i<input.length();i++){
			if(arr[input.charAt(i)-97]==1){
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// String str="abbcc";
		//output->0
		// String str="google";
		//output->4
		// String str="abc";
		//output->0
		String str="aabbcc";
		//output->-1
		System.out.println(findLeftMostNonRepeatingCharacter(str));

	}
}