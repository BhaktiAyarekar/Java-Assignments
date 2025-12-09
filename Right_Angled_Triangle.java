public class Right_Angled_Triangle {
       public static void main(String[] args) {
        int N = 5; // number of rows

        for (int i = 1; i <= N; i++) {         // for each row
            for (int j = 1; j <= i; j++) {     // print stars
                System.out.print("* ");
            }
            System.out.println();               // move to next line
        }
    }
}


