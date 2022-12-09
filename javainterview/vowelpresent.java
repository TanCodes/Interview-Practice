public class vowelpresent {
public static void main(String args[]){
    String st = new String("Hello");
    for(int i=0 ; i<st.length() ; i++){
    if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u' ){
        System.out.println("Vowel is present at" + i);
    }
    }
}
}
