class LeftMostRepeatingCharacter{
	
	public static int findLeftMostRepeatingCharacter1(String input){
		int[] arr=new int[26];
		for(int i=0;i<input.length();i++){
			arr[input.charAt(i)-97]++;
		}
		for(int i=0;i<input.length();i++){
			if(arr[input.charAt(i)-97]>1){
				return i;
			}
		}
		return -1;
	}

	public static int findLeftMostRepeatingCharacter2(String input){
		int[] arr=new int[26];
		int res=-1;
		for(int i=input.length()-1;i>=0;i--){
			arr[input.charAt(i)-97]++;
			if(input.charAt(i)-97>1){
				res=i;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// String str="abbcc";
		//output->1
		// String str="google";
		//output->0
		String str="abc";
		//output->-1
		System.out.println(findLeftMostRepeatingCharacter1(str));
		System.out.println(findLeftMostRepeatingCharacter1(str));

	}

}