import java.util.HashSet;
class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(Integer element:set){
            if(!set.contains(element-1)){
                int current=1;
                while(set.contains(element+current)){
                    current++;
                }
                res=res<current?current:res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}