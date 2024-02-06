class TwoPointerSum{
	public static int[] findTwoPointers(int[] arr,int x){
		int[] result=new int[2];
		int start=0;
		int end=arr.length-1;
		while(start<end){
			int sum=arr[start]+arr[end];
			if(sum==x){
				result[0]=start;
				result[1]=end;
				return result;
			}
			if(sum>x){
				end--;
			}
			else{
				start++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr={2,5,8,12,30};
		int x=17;
		int[] result=findTwoPointers(arr,x);
		for(int i:result){
			System.out.print(i+",");
		}

	}
}