public class frequencyLetter {
    public static void main(String args[]) {
        String s = "I am Tanmay";
        s = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int counter = 0;

            for (int i = 0; i < s.length(); i++) {
                if (ch == s.charAt(i)) {
                    counter++;
                }
            }
            if (counter != 0)
                System.out.println(ch + "\t" + counter);
        }
    }
}
