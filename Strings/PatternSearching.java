import java.util.List;
import java.util.ArrayList;

class PatternSearching{
	//T.C O((N-M+1)*M)
	public static List<Integer> patternList(String str,String pattern){

		List<Integer> list=new ArrayList<>();

		for(int i=0;i<=str.length()-pattern.length();i++){
			int count=0;
			for(int j=0;j<pattern.length();j++){
				if(str.charAt(i+j)!=pattern.charAt(j)){
					break;
				}
				count++;
			}
			if(count==pattern.length()){
				list.add(i);
			}
		}

		return list;
	}

	public static void main(String[] args) {
		// String str="geeksforgeeks";
		// String pattern="eks";
		//output->2,10
		// String str="aaaaa";
		// String pattern="aaa";
		//output->0,1,2
		// String str="abcab";
		// String pattern="abd";
		//output->
		String str="abababcd";
		String pattern="abab";
		//output->0,2
		System.out.println(patternList(str,pattern));
	}
}