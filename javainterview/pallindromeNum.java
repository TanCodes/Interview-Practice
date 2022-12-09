public class pallindromeNum {
    public static void main(String args[]){
        int num = 121;
        int temp=num , rev=0 , rem;

        while(temp!=0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }

        if(num==rev){
            System.out.println("is pallindrome");
        }else{
            System.out.println("not");
        }
    }  
}

