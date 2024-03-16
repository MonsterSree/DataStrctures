import java.util.ArrayList;
class PrintPathsWithRestrictions{
	
	static ArrayList<String> list=new ArrayList<>();
	public static void PrintPaths(String p,int r,int c,boolean[][] maze){
		if(r==maze.length-1 && c==maze[0].length-1){
			list.add(p);
			return;
		} 
		if(r<maze.length && c<maze.length && maze[r][c]){
			return;
		}
		if(r<maze.length){
			PrintPaths(p+"D",r+1,c,maze);
		} 

		if(c<maze[0].length){
			PrintPaths(p+"R",r,c+1,maze);
		}                                                        
				
	}

	public static void main(String[] args) {
		int row=0;
		int column=0;
		boolean[][] maze={{false,false,false},{false,true,false},{false,false,false}};
		PrintPaths("",row,column,maze);
		System.out.println(list);
	}
}	