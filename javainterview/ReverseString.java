public class ReverseString {
    public static void main(String[] args) {
    
        // simple string 
        String str="nayan";
        String rev="";
        int len=str.length();
        for(int i = len-1;i>=0;i--)
        {
            rev = rev + str.charAt(i); 
        }
        System.out.println("Reversed string is:"+ rev);

        // with stringbuilder

        StringBuilder sb = new StringBuilder("Tanmay");

        for(int i = 0 ; i<sb.length()/2 ; i++){
            int front = i;
            int back = sb.length()-1-i;

            char FrontChar = sb.charAt(front);
            char BackChar = sb.charAt(back);

            sb.setCharAt(front, BackChar);
            sb.setCharAt(back, FrontChar);
        }
        System.out.println(sb);

}
}