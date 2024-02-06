import java.util.Arrays;
import java.util.List;

public class AllocateBooks {
    public static int books(List<Integer> A, int B) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            sum=sum+A.get(i);
            max=Math.max(max,A.get(i));
        }
        
        int start=max;
        int end=sum;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isFeasible(A,B,mid)>B){
            	start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        
        return start;
    }
    
    public static int isFeasible(List<Integer> A, int B,int mid){
        int sum=0;
        int k=1;
        for(int i=0;i<A.size();i++){
            if(sum+A.get(i)>mid){
                k++;
                sum=A.get(i);
            }
            else{
            	sum=sum+A.get(i);
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
    	List<Integer> list=Arrays.asList(10,20,30,40);
    	int k=2;

    	System.out.println(books(list,k));
    }
}
