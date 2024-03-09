class GCDOfTwoNumbers{
	
	public static int findGCD(int a,int b){
		if(b==0){
			return a;
		}
		else return findGCD(b,a%b);
	}

	public static void main(String[] args) {
		int a=4;
		int b=6;
		System.out.println(findGCD(a,b));
	}
}