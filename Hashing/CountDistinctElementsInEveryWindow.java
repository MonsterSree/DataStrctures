import java.util.HashMap;
class CountDistinctElementsInEveryWindow{
	public static void countDistinctFreq(int[] nums,int k){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<k;i++){
			int count=map.getOrDefault(nums[i],0);
			count++;
			map.put(nums[i],count);
		}
		System.out.println(map.size());
		for(int i=k;i<nums.length;i++){
			int count=map.getOrDefault(nums[i],0);
			count++;
			map.put(nums[i],count);
			if(map.get(nums[i-1])==1){
				map.remove(nums[i-1]);
			}
			System.out.println(map.size());
		}
	}
	
	public static void main(String[] args) {
		int[] arr={10,20,10,10,30,40,10};
		int k=4;
		countDistinctFreq(arr,k);
	}
}