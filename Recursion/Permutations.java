import java.util.ArrayList;
class Permutations{
	
	public static void printPermutations(String p,String uP){
		if(uP.isEmpty()){
			System.out.print(p+",");
			return;
		}
		char ch=uP.charAt(0);

		for(int i=0;i<=p.length();i++){
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			printPermutations(f+ch+s,uP.substring(1));
		}
	}

	public static ArrayList<String> returnPermutations(String p,String uP){
		if(uP.isEmpty()){
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch=uP.charAt(0);

		ArrayList<String> result=new ArrayList<>();

		for(int i=0;i<=p.length();i++){
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			result.addAll(returnPermutations(f+ch+s,uP.substring(1)));
		}
		return result;
	}

	public static void main(String[] args) {
		String input="abc";
		printPermutations("",input);
		System.out.println();
		System.out.println(returnPermutations("",input));
	}
}