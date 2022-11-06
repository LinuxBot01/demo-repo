public class pattern1 {
    public static void main(String[] args) {
        // start pattern
        for (int index = 0; index < 5; index++) {
            for (int i = 0; i < index; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
