public class main {
    public static void main(String[] args) {
         int a = 5, b = 8, c = 7;
         for ( int i = 0; i < b; i++ ){
             System.out.println( "i = " + i );
         }
         while ( a < 10){
             a++;
             System.out.println ( "a = " + a );
         }
        do {
            System.out.println( "c = " + c );
            c--;
        } while ( c > 1 );
    }
}
