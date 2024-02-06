import java.util.Arrays;

class TripletSum{
	public static int[] tripletSum(int[] arr,int x){
		int[] result=new int[3];
		for(int i=0;i<arr.length;i++){
			result[0]=i;
			int[] res=twoPointer(arr,i+1,arr.length-1,x-arr[i]);
			if(res[0]!=res[1]){
				result[1]=res[0];
				result[2]=res[1];
				return result;
			}
		}
		return result;
	}
	public static int[] twoPointer(int[] arr,int start,int end,int k){
		int[] result=new int[2];
		while(start<end){
			int sum=arr[start]+arr[end];
			if(sum==k){
				result[0]=start;
				result[1]=end;
				return result;
			}
			else if(sum<k){
				start++;
			}
			else{
				end--;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// int[] arr={2,3,4,8,9,20,40};
		// int x=32;
		int[] arr={2,3,5,6,15};
		int x=20;
		int[] result=tripletSum(arr,x);
		for(int i:result){
			System.out.print(i+",");
		}
	}
}