class CountZeros{

	public static int countZeros(int number,int count){
		if(number==0){
			return count;
		}
		int remainder=number%10;
		if(remainder==0){
			count++;
		}
		return countZeros(number/10,count);
	}
	
	public static void main(String[] args) {
		int number=100050;
		System.out.println(countZeros(number,0 ));
	}
}