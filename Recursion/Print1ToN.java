class Print1ToN{
	public static void print1ToN(int n){
		if(n==0){
			return;
		}
		System.out.println(n);
		print1ToN(n-1);
	}

	public static void main(String[] args) {
		int n=5;
		print1ToN(5);
	}
}