public class Pattern{
    public static void main(String args[]){
        int row = 3;
        //outer loop
        for(int i=1; i<=row; i++){
            //inner loop (space)
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }

            //inner loop(star)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}