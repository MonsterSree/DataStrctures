class SumOfDigits{

	public static int sumOfDigits(int number){
		if(number<10){
			return number;
		}

		return number%10+sumOfDigits(number/10);
	}

	public static void main(String[] args) {
		int number=1234;
		System.out.println(sumOfDigits(number));
	}
}