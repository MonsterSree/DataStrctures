class Palindrome{
	
	public static boolean isStringPalidrome(String input,int start,int end){
		if(start>=end){
			return true;
		}

		if(input.charAt(start)!=input.charAt(end)){
			return false;
		}

		return isStringPalidrome(input,start+1,end-1);
	}


	public static void main(String[] args) {
		String input="aabbaa";
		System.out.println(isStringPalidrome(input,0,input.length()-1));
	}
}