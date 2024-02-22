class PrintBoundaryElements{
	public static void print(int[][] nums){
		for(int i=0;i<nums[0].length;i++){
			System.out.print(nums[0][i]+",");
		}

		for(int i=1;i<nums.length;i++){
			System.out.print(nums[i][nums[i].length-1]+",");
		}

		for(int i=nums[nums.length-1].length-2;i>=0;i--){
			System.out.print(nums[nums.length-1][i]+",");
		}

		for(int i=nums.length-2;i>0;i--){
			System.out.print(nums[i][0]+",");
		}
	}
	public static void main(String[] args) {
		int[][] nums={{1,2,3,4}};
		print(nums);
	}
}