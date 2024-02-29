import java.util.ArrayList;
class PrintPathsDiagonal{
	
	public static ArrayList<String> PrintPaths(String p,int r,int c){
		if(r==1 && c==1){
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		} 
		ArrayList<String> result=new ArrayList<>();
		if(r>1 && c>1){
			result.addAll(PrintPaths(p+"D",r-1,c-1));
		}
		if(r>1){
			result.addAll(PrintPaths(p+"V",r-1,c));
		} 

		if(c>1){
			result.addAll(PrintPaths(p+"H",r,c-1));
		} 
		return result;                                                       
				
	}

	public static void main(String[] args) {
		int row=3;
		int column=3;
		System.out.println(PrintPaths("",row,column));
	}
}	