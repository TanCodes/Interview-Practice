public class pallindromeString {
    public static void main(String[] args) {
        String str = "nayan" , rev="";

        for(int i=str.length()-1 ; i>=0 ; i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev))  //equals return a  bollean true or flase value
        {
            System.out.println("Is a pallindrome");
        }else{
            System.out.println("Is a not pallindrome");
        }
       
    }
}
