class CountPaths{
	
	public static int countPaths(int r,int c){
		if(r==1 || c==1){
			return 1;
		}
		return countPaths(r-1,c)+countPaths(r,c-1);
	}

	public static void main(String[] args) {
		int row=3;
		int column=3;
		System.out.println(countPaths(row,column));
	}
}