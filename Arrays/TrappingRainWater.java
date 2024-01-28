class TrappingRainWater{
	
	public static int maxTrappingWater(int[] arr){
		int result=0;
		int[] lMax=new int[arr.length];
		int[] rMax=new int[arr.length];
		//creating left Max
		lMax[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			lMax[i]=Math.max(arr[i],lMax[i-1]);
		}
		//creating right max
		rMax[arr.length-1]=arr[arr.length-1];
		for(int j=arr.length-2;j>=0;j--){
			rMax[j]=Math.max(arr[j],rMax[j+1]);
		}
		//calculating result

		for(int k=1;k<arr.length-1;k++){
			result=result+(Math.min(lMax[k],rMax[k])-arr[k]);
		}
		return result;

	}

	public static void main(String[] args) {
		int[] arr={3,0,1,2,5};
		// int[] arr={2,0,2};
		System.out.println(maxTrappingWater(arr));
	}
}