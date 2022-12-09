class text{
    public static void main(String args[]){
        String x = "Hello";
        
        String st = new String(x);
        StringBuffer stbuffer = new StringBuffer(x);
        StringBuilder stbuilder = new StringBuilder(x);
        
        st.concat("Tanmay");
        stbuffer.append("Tanmay");
        stbuilder.append("Tanmay");
        
        System.out.println(st);
        System.out.println(stbuffer);
        System.out.println(stbuilder);
    }
}