import java.util.ArrayList;
class PrintPaths{
	
	static ArrayList<String> list=new ArrayList<>();
	public static void PrintPaths(String p,int r,int c){
		if(r==1 && c==1){
			list.add(p);
			return;
		} 
		if(r>1){
			PrintPaths(p+"D",r-1,c);
		} 

		if(c>1){
			PrintPaths(p+"R",r,c-1);
		}                                                        
				
	}

	public static void main(String[] args) {
		int row=3;
		int column=3;
		PrintPaths("",row,column);
		System.out.println(list);
	}
}	