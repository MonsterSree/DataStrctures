import java.util.HashMap;
class LongestSubArrayWithGivenSum{
	
	public static int maxLengthOfSubArrayWithGivenSum(int[] arr,int sum){
		HashMap<Integer,Integer> map=new HashMap<>();
		int len=0;
		int preFix=0;
		for(int i=0;i<arr.length;i++){
			preFix+=arr[i];
			if(preFix==sum){
				len=len<i+1?i+1:len;
			}
			if(map.get(preFix-sum)==null){
				map.putIfAbsent(preFix,i);
			}
			else{
				int preFixIndex=map.get(preFix-sum);
				len=len<(i-preFixIndex) ? i-preFixIndex: len;
			}
		}
		return len;

	}

	public static void main(String[] args) {
		int[] arr={8,3,1,5,-6,6,2,2};
		int sum=4;
		System.out.println(maxLengthOfSubArrayWithGivenSum(arr,sum));
	}
}