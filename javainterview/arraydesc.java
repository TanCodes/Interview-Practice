class arraydesc{
    public static void main(String[] args) {
        int arr[] = {30 , 20 , 50 , 10 , 100};
        int temp;

        for(int i=0 ; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i] < arr[j]){               //for ascending >
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i= 0; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}