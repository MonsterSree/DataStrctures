class SubSequenceOfString{

	public static boolean isSubSequence(String s1,String s2){
		int j=0;
		for(int i=0;i<s1.length() && j<s2.length();i++){
			if(s1.charAt(i)==s2.charAt(j)){
				j++;
			}
		}
		if(j==s2.length()){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s1="ABCD";
		String s2="AD";

		System.out.println(isSubSequence(s1,s2));
	}
	
}