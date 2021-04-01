
package classthreadprincipal;

public class ClassThreadPrincipal {

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        ThreadHeranca her1 = new ThreadHeranca(buf, "texto1\n");
        ThreadHeranca her2 = new ThreadHeranca(buf, "texto2\n");
        ThreadHeranca her3 = new ThreadHeranca(buf, "texto3\n");
        
        her1.start();
        her2.start();
        her3.start();
        
        for(int i = 0; i<Integer.MAX_VALUE/10;i++);
        System.out.println(buf.toString());
        
    }
    
}
