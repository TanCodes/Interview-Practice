public class LinearSearchString {
    public static void main(String[] args) {
        String arr[] = { "Tanmay", "Appy", "Sagar", "Shippi", "Venky" };
        String to_find = "Appy";
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == to_find) // arr[i].equals(to_find) gives the same op
            {
                System.out.print("Item found on index " + i);
                pos += 1;
            }
        }
        if (pos == 0) {
            System.out.println("Item not found ");
        }
    }
}
