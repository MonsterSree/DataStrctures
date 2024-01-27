class SubSets{
	
	public static void subSets(String input,String subSet,int start){
		if(start==input.length()){
			System.out.println(subSet);
			return;
		}

		subSets(input,subSet,start+1);
		subSets(input,subSet+input.charAt(start),start+1);

	}

	public static void main(String[] args) {
		String input="abc";
		subSets(input,"",0);
	}
}