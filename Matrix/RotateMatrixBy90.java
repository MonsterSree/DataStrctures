class RotateMatrixBy90{

	public static void print(int[][] nums){
		int[][] temp=new int[nums.length][nums.length];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				temp[nums.length-1-j][i]=nums[i][j];
			}
		}
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				System.out.print(nums[i][j]+",");
			}
			System.out.println();
		}
		System.out.println("After rotating-->");
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<temp.length;j++){
				System.out.print(temp[i][j]+",");
			}
			System.out.println();
		}
	}

	public static void printEfficientApproach(int[][] nums){

		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				System.out.print(nums[i][j]+",");
			}
			System.out.println();
		}
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				int temp=nums[i][j];
				nums[i][j]=nums[j][i];
				nums[j][i]=temp;
			}
		}
		for(int i=0;i<nums.length/2;i++){
			int temp[] = nums[i];
			nums[i]=nums[nums.length-i-1];
			nums[nums.length-i-1]=temp;
		}
		System.out.println("After rotating-->");
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				System.out.print(nums[i][j]+",");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		print(nums);
		System.out.println("Efficient Approach");
		printEfficientApproach(nums);
	}
}