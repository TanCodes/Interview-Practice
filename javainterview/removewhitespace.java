public class removewhitespace {
    public static void main(String args[]){
        String st = "This is  Tanamy Barvi     ";
        st = st.replaceAll("\\s", "");
        System.out.println(st);
    }
}
