import java.util.List;
import java.util.ArrayList;
class DiceThrow{
	//Amazon problem
	public static void getPossibilities(String p,int up){
		if(up==0){
			System.out.println(p);
			return ;
		}
		for(int i=1;i<=6 && i<=up;i++){
			getPossibilities(p+i,up-i);		
		}
		// return result;
	}

	public static List<String> getPossibilitiesAsList(String p,int up){
		if(up==0){
			List<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		List<String> result=new ArrayList<>();
		for(int i=1;i<=6 && i<=up;i++){
			result.addAll(getPossibilitiesAsList(p+i,up-i));		
		}
		return result;
	}

	public static void main(String[] args) {
		int target=4;
		getPossibilities("",target);
		System.out.println(getPossibilitiesAsList("",target));
	}
}