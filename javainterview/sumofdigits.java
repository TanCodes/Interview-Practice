public class sumofdigits {
    public static void main(String args[]){
        int num=234 , lastdigit=0 , sum=0;
        while(num>0){
        lastdigit = num%10;
        sum = sum+lastdigit;
        num = num/10; 
        }
        System.out.println(sum);
    }
}
