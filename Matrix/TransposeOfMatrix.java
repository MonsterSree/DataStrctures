class TransposeOfMatrix{
	public static void print(int[][] nums){
		int[][] temp=new int[nums.length][nums.length];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				temp[i][j]=nums[j][i];
			}
		}
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				System.out.print(nums[i][j]+",");
			}
			System.out.println();
		}
		System.out.println("After Transpose-->");
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<temp.length;j++){
				System.out.print(temp[i][j]+",");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		int[][] nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		print(nums);
	}
}