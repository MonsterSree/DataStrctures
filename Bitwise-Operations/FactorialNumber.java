class FactorialNumber{

	public static int factorialOfNumber(int n){
		int result=1;
		while(n>0){
			result=result*n;
			n=n-1;
		}
		return result;
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println("Factorial of number -> "+factorialOfNumber(n));
	}
}