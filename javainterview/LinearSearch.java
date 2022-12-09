public class LinearSearch {
    public static void main(String args[]){
        int arr[] = {10,30,70,50,60};
        int num_to_find = 50;
        int pos = 0;

        for(int i=0 ; i<arr.length;i++){
            if(arr[i] == num_to_find){
                System.out.print("Element found at index " + i);
                pos = pos + 1;       // pos += 1;
               
            }
        }
        if(pos==0){
            System.out.println("Element not found");
        }
    }
}
