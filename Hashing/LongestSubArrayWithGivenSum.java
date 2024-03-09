import java.util.HashMap;
class LongestSubArrayWithGivenSum{
	
	public static int maxLengthOfSubArrayWithGivenSum(int[] A,int K){
		HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int res=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            if(sum==K){
                res=res<i+1?i+1:res;
            }
            if(map.get(sum)==null){
                map.putIfAbsent(sum,i);

            }
            if(map.get(sum-K)!=null){
                int index=map.get(sum-K);
                res=res<i-index?i-index:res;
            }
            
        }
        return res;

	}

	public static void main(String[] args) {
		int[] arr={1,12,18,13,8,-2,12,-1,-10,6,3,-14,0,4,10,0,-7,3,-12,18};
		int sum=30;
		System.out.println(maxLengthOfSubArrayWithGivenSum(arr,sum));
	}
}