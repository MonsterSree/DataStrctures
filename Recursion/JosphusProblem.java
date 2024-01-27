class JosphusProblem{

	public static int findSurviour(int n,int k){
		if(n==1){
			return 0;
		}
		else{
			return (findSurviour(n-1,k)+k)%n;
		}
	}

	public static void main(String[] args) {
		int n=2;
		int k=2;
		System.out.println(findSurviour(n,k));
	}
}