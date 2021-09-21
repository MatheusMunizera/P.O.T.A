

package javaapp;

/**
 *
 * @author munizera
 */
public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(func(5));
    }
    
    public static int func(int n) {
		int i, r, j;
		r = 1;
		i = 1;
		j = 1;
		while (i <= n) {
			while (j <= n){
				r = r*n; i++;
			}
		}
		return r;
	}

}
