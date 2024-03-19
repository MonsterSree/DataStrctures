import java.util.Deque;
import java.util.ArrayDeque;

/**
 * design data structure to be done below methods with in T.C O(1);
 * */

class MinMaxDataStructure{
	
	Deque<Integer> deque;

	public MinMaxDataStructure(){
		deque=new ArrayDeque<>();
	}


	public void insertMin(int val){
		deque.offerFirst(val);
	}

	public void insertMax(int val){
		deque.offerLast(val);
	}

	public int getMin(){
		return deque.peekFirst();
	}

	public int getMax(){
		return deque.peekLast();
	}

	public int extraxtMin(){
		return deque.pollFirst();
	}

	public int extractMax(){
		return deque.pollLast();
	}

	public static void main(String[] args) {
		MinMaxDataStructure ds=new MinMaxDataStructure();
		ds.insertMin(5);
		ds.insertMax(10);
		ds.insertMin(3);
		ds.insertMax(15);
		ds.insertMin(2);

		System.out.println("printing min value -> "+ds.getMin());
		System.out.println("printing max value -> "+ds.getMax());

		ds.insertMin(1);
		System.out.println("printing min value -> "+ds.getMin());
		ds.insertMax(20);
		System.out.println("printing max value -> "+ds.getMax());


	}
}