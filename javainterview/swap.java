public class swap {
    public static void main(String args[]){

        // swapping number with 3 variable
        int a = 20 , b = 30 , temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a =" + a + "b=" + b);
        
        // swapping number without 3 variable
        int x = 10 , y = 20;
        x = x*y;
        y = x/y;
        x = x/y;
        System.out.println("x =" + x + "y=" + y);
    }

}
