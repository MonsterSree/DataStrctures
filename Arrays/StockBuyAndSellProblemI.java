class StockBuyAndSellProblemI{
	
	public static int maxProfitOfStock(int[] arr){
		int maxProfit=0;
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]-min>maxProfit){
				maxProfit=arr[i]-min;
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// int[] arr={1,5,3,8,2};
		int[] arr={30,20,10};
		System.out.println(maxProfitOfStock(arr));

	}
}