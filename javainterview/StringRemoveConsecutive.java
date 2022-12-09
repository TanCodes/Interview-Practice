public class StringRemoveConsecutive {
    public static void main(String args[]){
        String s = "Taanmayyy";
        String n="";
        char prevChar = ' ';

        for(int i=0 ; i<s.length(); i++){
            if(prevChar!=s.charAt(i)){
                n = n+s.charAt(i);
            }
            prevChar = s.charAt(i);
        }
        System.out.println(n);
    }
}
