class PalindromNumber{
	public static boolean checkPalindromNumber(int number){
		int reverse=0;
		int n=number;
		while(n>0){
			int reminder=n%10;
			reverse=reverse*10+reminder;
			n=n/10;
		}

		return reverse == number;
	}

	public static void main(String[] args) {
		int n=101;
		System.out.println("is Number palindrome -> "+checkPalindromNumber(n));
	}
}