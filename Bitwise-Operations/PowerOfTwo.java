class PowerOfTwo{

	public static boolean isPowerOfTwo(int n){
		
		if(n==0){
			return false;
		}

		return n<0 ? (n & (n-1)) == n : (n & (n-1)) == 0;

	}

	public static void main(String[] args) {
		int n=;
		System.out.println(isPowerOfTwo(n));
	}
}