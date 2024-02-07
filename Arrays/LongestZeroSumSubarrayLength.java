import java.util.HashMap;

public class LongestZeroSumSubarrayLength {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==0){
                max=Math.max(i+1,max);

            }
            else{
                if(map.keySet().contains(sum)){
                    int index=map.get(sum);
                    max=Math.max(i-index,max);
                }
                else{
                    map.put(sum,i);
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={1,0,-1,1};
        System.out.println(getLongestZeroSumSubarrayLength(arr));
    }
}