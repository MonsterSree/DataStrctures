import java.util.ArrayList;
import java.util.LinkedList;

class Hashing{
	int bucket;
	ArrayList<LinkedList<Integer>> table;

	public Hashing(int bucket){
		this.bucket=bucket;
		this.table=new ArrayList<>();
		for(int i=0;i<bucket;i++){
			table.add(new LinkedList<Integer>());
		}
	}

	public void insert(int element){
		int key=element%bucket;
		table.get(key).add(element);
	}
	public void remove(int element){
		int key=element%bucket;
		table.get(key).remove(element);
	}
	public boolean search(int element){
		int key=element%bucket;
		return table.get(key).contains(element);
	}

	public static void main(String[] args) {
		Hashing hashing=new Hashing(5);
		hashing.insert(1);
		hashing.insert(2);
		hashing.insert(3);
		hashing.insert(4);
		System.out.println(hashing.search(4));
		System.out.println(hashing.search(3));
		System.out.println(hashing.search(5));
	}
}