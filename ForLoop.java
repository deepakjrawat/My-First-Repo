package Package1.Concepts;

/**
 * Created by DRawat on 11/9/2016.
 */
public class ForLoop {
    public static void main (String args[]) {
        for ( int i= 50 ;i<=80 ;i++){
            if (i% 2 == 0 ){
                System.out.println(i);
            }
            else {
                break ;
            }
        }
    }
}
