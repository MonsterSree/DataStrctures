import java.util.HashMap;
class LRUCache{
	
	class Node{
		Node prev;
		int key;
		int value;
		Node next;

		public Node(int key,int val){
			this.prev=null;
			this.next=null;
			this.value=val;
			this.key=key;
		}
	}

	Node head;
	Node tail;
	HashMap<Integer,Node> hashMap;
	int capacity;

	public LRUCache(int capacity){

		head=new Node(0,0);

		tail=new Node(0,0);

		head.next=tail;
		tail.prev=head;

		hashMap=new HashMap<>();
		this.capacity=capacity;
	}

	public void put(int key,int element){

		if(hashMap.keySet().contains(key)){
			Node node=hashMap.get(key);
			Node prevNode=node.prev;
			Node nextNode=node.next;

			prevNode.next=nextNode;
			nextNode.prev=prevNode;
			hashMap.remove(node.key);
		}

		if(hashMap.size()>=capacity){
			Node toBeDeleted=tail.prev;
			int keyBeDeleted=toBeDeleted.key;
			hashMap.remove(keyBeDeleted);
			Node toBeDeletedPrev=toBeDeleted.prev;

			toBeDeletedPrev.next=tail;
			tail.prev=toBeDeletedPrev;


		}
		
		Node node=new Node(key,element);

		Node next=head.next;

		head.next=node;
		node.prev=head;

		node.next=next;
		next.prev=node;

		hashMap.put(key,node);
	}

	public int get(int key){

		Node node=hashMap.get(key);

		if(node==null){
			return -1;
		}

		Node prevNode=node.prev;
		Node nextNode=node.next;

		prevNode.next=nextNode;
		nextNode.prev=prevNode;
		hashMap.remove(node.key);
		this.put(node.key,node.value);
		

		return node.value;

	}	

	public void display(){
		Node temp=head;

		while(temp!=null){
			System.out.print("Node-> ( "+temp.key+","+temp.value+")");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LRUCache lruCache=new LRUCache(1);
		lruCache.put(2,1);
		System.out.println(lruCache.get(2));
		// lruCache.put(2,2);
		// lruCache.display();
		// System.out.println(lruCache.get(1));
		// lruCache.display();
		// lruCache.put(3,3);
		// lruCache.display();

		// System.out.println(lruCache.get(2));
		// lruCache.display();
		// lruCache.put(4,4);
		// lruCache.display();
		// System.out.println(lruCache.get(1));
		// System.out.println(lruCache.get(3));
		// System.out.println(lruCache.get(4));
	}


}