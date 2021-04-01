
package trabalho_coimbra;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Factorial {

    public Factorial() {
        
    }
    
    public void Triangulo_Pascal(){
        int number,i,j,k ;
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a int number into 1 and 12");
        try{
        number =input.nextInt();
       
        boolean condiction=(number<1) ||  (number>12);
        
        //javax.swing.JOptionPane.showMessageDialog(null,condiction);
        if (condiction){
                System.out.println(" Invalid Number ");
                System.exit(0);
        }else{
              for(i=0;i<=number;i++){// loop for rows 
                 for(j=i;j<=(number);j++){// loop for spacess
                        System.out.print(" ");
                  }
                  
                  for(k=0;k<=i;k++){//loop for a incremment 
                      ncr(i,k) ;  
                      System.out.print( "  ");
                      if(i==number)
                      System.exit(0);
                  } 
                
                /*
                  for(k=0;k<=i;k++){//loop fr a decremment
                      System.out.print("  "+ncr(i,k));
                  }*/
                  System.out.println();
              }
             
        }
      
        
    } catch(NumberFormatException e){
                System.out.println("Ocoreeu um erro");
        } 
    }
     
      public static int factorial(int n){
          int f;
          for(f=1;n>1;n--){
              f*=n;
          }return f;
      }
      public static void ncr(int n , int r){
         final String[] alfabeto={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            int combi=factorial(n)/(factorial(n-r)*factorial(r));
            switch(combi){
                case 1: System.out.print("A");break;
                case 2: System.out.print("B");break;
                case 3: System.out.print("C");break;
                case 4: System.out.print("D");break;
                case 5: System.out.print("E");break;
                case 6: System.out.print("F");break;
                case 7: System.out.print("G");break;
                case 8: System.out.print("H");break;
                 case 9: System.out.print("I");break;
                case 10: System.out.print("J");break;
                case 11: System.out.print("K");break;
                case 12: System.out.print("L");break;
                case 13: System.out.print("M");break;
                case 14: System.out.print("N");break;
                case 15: System.out.print("O");break;
                case 16: System.out.print("P");break;
                case 17: System.out.print("Q");break;
                case 18: System.out.print("R");break;
                case 19: System.out.print("S");break;
                case 20: System.out.print("T");break;
                case 21: System.out.print("U");break;
                case 22: System.out.print("V");break;
                case 23: System.out.print("W");break;
                case 24: System.out.print("X");break;
               // case 25:System.out.print("A ");break;
                default: break;
            }
           
      }
}
