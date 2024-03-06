
class MinimumCostToMakeSortedArray{
	
	public static int minimumCost(int[] arr,int n){
		int ascCount=0;
		int dscCount=0;
		int ascElement=arr[0];
		int desElement=arr[n-1];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<ascElement){
				ascCount+=ascElement-arr[i];
			}
			else{
				ascElement=arr[i];
			}

			
		}
		for(int j=n-2;j>=0;j--){
			if(arr[j]<desElement){
				dscCount+=desElement-arr[j];
			}
			else{
				desElement=arr[j];
			}
		}
		return Math.min(ascCount,dscCount);
	}

	public static void main(String[] args) throws Exception{
		// int[] arr={0,1,2,5,6,5,7};
		// int[] arr={7,8,6,6,6,6};
		int[] arr={9,8,7,2,3,3};
		
		// int[] arr={1,2,3,3,4};
		System.out.println(minimumCost(arr,arr.length));
	}


}