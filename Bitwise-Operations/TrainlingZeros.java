class TrainlingZeros{
	public static int tralingZerosOfNumber(int n){
		int result=1;
		int count=0;
		while(n>0){
			result=result*n;
			n=n-1;
		}
		while(result>0){
			int remainder=result%10;

			if(remainder==0){
				count++;
			}else{
				return count;
			}
			result=result/10;
		}
		return count;
	}
	public static void main(String[] args) {
		int n=10;
		System.out.println("TrainlingZeros -> "+tralingZerosOfNumber(n));
	}
}