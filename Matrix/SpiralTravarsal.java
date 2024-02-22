class SpiralTravarsal{

	public static void print(int[][] nums){
		int top=0;
		int left=0;
		int bottom=nums.length-1;
		int right=nums[0].length-1;

		while(top<=bottom && left<=right){
			for(int i=left;i<=right;i++){
				System.out.print(nums[top][i]+",");
			}
			top++;
			for(int i=top;i<=bottom;i++){
				System.out.print(nums[i][right]+",");
			}
			right--;
			if(top<=bottom){
				for(int i=right;i>=left;i--){
					System.out.print(nums[bottom][i]+",");
				}
				bottom--;
			}
			if(left<=right){
				for(int i=bottom;i>=top;i--){
					System.out.print(nums[i][left]+",");
				}
				left++;
			}
		}
	}

	public static void main(String[] args) {
		int[][] nums={{1,2},{5,6},{9,10},{13,14}};
		print(nums);
	}
}