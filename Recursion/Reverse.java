class Reverse{
	
	public static int reverseNumber(int number,int reverse){

		if(number==0){
			return reverse;
		}
		int remainder=number%10;
		reverse=reverse*10+remainder;
		return reverseNumber(number/10,reverse);

	}
	public static void main(String[] args) {
		int number=12345;
		System.out.println(reverseNumber(number,0));
	}
}