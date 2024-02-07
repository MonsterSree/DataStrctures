class MergeSort{

	public static void sort(int[] arr){
		if(arr.length==1){
			return;
		}
		int start=0;
		int end=arr.length-1;
		int mid=start+(end-start)/2;
		int[] left=divide(arr,start,mid);
		int[] right=divide(arr,mid+1,end);
		sort(left);
		sort(right);
		combine(arr,left,right);
	}

	public static int[] divide(int[] arr,int start,int end){
		int[] res=new int[end-start+1];
		int j=0;
		for(int i=start;i<=end;i++){
			res[j]=arr[i];
			j++;
		}
		return res;
	}

	public static void combine(int[] arr,int[] left,int[] right){
		int start=0;
		int lstart=0;
		int rstart=0;
		while(lstart<left.length && rstart<right.length){
			if(left[lstart]<right[rstart]){
				arr[start]=left[lstart];
				start++;
				lstart++;
			}
			else{
				arr[start]=right[rstart];
				start++;
				rstart++;
			}
		}

		while(lstart<left.length){
			arr[start]=left[lstart];
			start++;
			lstart++;
		}

		while(rstart<right.length){
			arr[start]=right[rstart];
			start++;
			rstart++;
		}

	}
	
	public static void main(String[] args) {
		// int[] arr={8,3,4,12,5,6};
		// int[] arr={10,9,8,5,4,3,1};
		int[] arr={10,1};
		sort(arr);
		for(int i:arr){
			System.out.print(i+",");
		}
	}
}