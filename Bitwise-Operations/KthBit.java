class KthBit{
	public static boolean isKthBitSet(int n,int k){
		n=n>>(k-1);
		return (n&1) != 0;
	}
	public static void main(String[] args) {
		int n=5;
		int k=1;
		System.out.println(isKthBitSet(n,k));
	}
}