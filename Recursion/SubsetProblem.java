class SubsetProblem{

	public static int findSubsetsCount(int[] arr,int sum){
		int intialSum=0;
		int count=0;
		int startIndex=0;
		count=findSubsets(arr,sum,startIndex,intialSum);

		return count;
	}

	public static int findSubsets(int[] arr,int sum,int startIndex,int intialSum){

		if(startIndex==arr.length){
			if(sum==intialSum){
				return 1;
			}
			return 0;
		}

		return findSubsets(arr,sum,startIndex+1,intialSum) + findSubsets(arr,sum,startIndex+1,intialSum+arr[startIndex]);

	}

	public static void main(String[] args) {
		int[] arr={10,5,2,3,6};
		int sum=8;
		System.out.println(findSubsetsCount(arr,sum));
	}
}