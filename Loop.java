public class Loop {
    public static void main(String args[]){
        // Outer loop (Rows)
        for(int i = 1; i <= 3; i++){
            // Inner loop (Columns)
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println(); // Moves to the next line after inner loop finishes
        }
    }
}