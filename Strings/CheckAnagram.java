import java.util.HashMap;

class CheckAnagram {
    public static boolean isAnagramApproach1(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            int count=map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),count+1);
        }

        for(int i=0;i<t.length();i++){
            int count=map.getOrDefault(t.charAt(i),0);
            if(count==0){
                return false;
            }
            map.put(t.charAt(i),count-1);
        }
        return true;
    }

    //efficient approach
    public static boolean isAnagramApproach2(String s, String t) {
        int charSize=256;

        int[] arr=new int[256];

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
            arr[t.charAt(i)]--;
        }

        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String s1="aaacb";
        String s2="cabaa";
        System.out.println(isAnagramApproach1(s1,s2));
        System.out.println(isAnagramApproach2(s1,s2));


    }
}