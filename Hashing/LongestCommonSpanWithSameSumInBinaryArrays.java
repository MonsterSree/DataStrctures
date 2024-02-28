import java.util.HashMap;
class LongestCommonSpanWithSameSumInBinaryArrays{
	
	public static int longestCommonSpan(int[] arr1,int[] arr2){
		int[] temp=new int[arr1.length];
		for(int i=0;i<temp.length;i++){
			temp[i]=arr1[i]-arr2[i];
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		int res=0;
		int preFix=0;
		for(int i=0;i<temp.length;i++){
			preFix+=temp[i];

			if(preFix==0){
				res=res<i+1?i+1:res;
			}

			map.putIfAbsent(preFix,i);

			if(map.get(preFix)!=null){
				res=i-map.get(preFix)>res? i-map.get(preFix):res;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr1={0,1,0,0,0,0};
		int[] arr2={1,0,1,0,0,1};
		System.out.println(longestCommonSpan(arr1,arr2));
	}
}
