class StockBuyAndSellProblemII{
	
	public static int maxProfitOfStock(int[] arr){
		int maxProfit=0;
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]>arr[i-1]){
				maxProfit+=arr[i]-arr[i-1];
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// int[] arr={1,5,3,8,2};
		int[] arr={1,5,3,8,12};
		System.out.println(maxProfitOfStock(arr));

	}
}