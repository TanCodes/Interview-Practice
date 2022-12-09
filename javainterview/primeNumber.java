public class primeNumber {
    public static void main(String[] args) {
        int num=3;
        boolean prime=true;

        for(int i = 2 ; i<num ; i++){
            if(num % i ==0){
                prime = false;
                break;
            }
        }

        System.out.println(prime);
    }
}

// boolean true means it is a prime. false means not a prime .
