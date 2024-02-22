class PrintMatrixInSnakePattern{
	public static void print(int[][] nums){
		for(int i=0;i<nums.length;i++){
			if((i&1)==0){
				for(int j=0;j<nums[i].length;j++){
					System.out.print(nums[i][j]+",");
				}
			}
			else{
				for(int j=nums[i].length-1;j>=0;j--){
					System.out.print(nums[i][j]+",");
				}
			}
			System.out.println();

		}
	}
	public static void main(String[] args) {
		int[][] nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		print(nums);
	}
}