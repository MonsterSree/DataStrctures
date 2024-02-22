import java.util.List;
import java.util.ArrayList;
class PhonePad{

	//google problem
	public static List<String> printPhonePadCharacters(String p,String up){

		if(up.isEmpty()){
			List<String> subResult=new ArrayList<>();
			subResult.add(p);
			return subResult;
		}
		char chr=up.charAt(0);
		int ch=chr-'0';
		List<String> result=new ArrayList<>();
		for(int i=((ch-1)*3);i<(ch*3);i++){
			if(i==26){
				continue;
			}
			char res=(char)('a'+i);
			result.addAll(printPhonePadCharacters(p+res,up.substring(1)));
		}
		return result;
	}


	
	public static void main(String[] args) {
		String input="89";
		System.out.println(printPhonePadCharacters("",input));
	}
}