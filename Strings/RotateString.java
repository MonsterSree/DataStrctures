class RotateString {
    public  static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        s=s+s;
        for(int i=0;i<=s.length()-goal.length();i++){
            String subString=s.substring(i,i+goal.length());
            if(subString.equals(goal)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdab";
        System.out.println(rotateString(s1,s2));
        //output-> true
    }
}