package orildo;
public class Calculadora 
{
    public static int soma(int a, int b)
    {
        int sum = a + b;
       return sum;
    }
    
    public static int diferenca(int a, int b)
    {
        int difer = a - b;
       return difer;
    }
    
    public static int producto (int a, int b)
    {
        int prod = a * b;
       return prod;
    }
    
    public static int divisao (int a, int b)
    {
        int div = a / b;
       return div;
    }
    
    public static void main(String [] args)
    {
       int num;
       int num1;
       
       java.util.Scanner input = new java.util.Scanner(System.in);
       
       System.out.printf("---------------\tCALCULADORA BASICA---------------%n\tIntroduza os numeros:%n%n");
       System.out.print("1 Numero: ");
       num = input.nextInt();
       
       System.out.print("2 Numero: ");
       num1 = input.nextInt();
       
       System.out.printf("%nSoma: %d%nDiferenca: %d%nDivisao: %d%nProducto: %d%n%n",
                   soma(num,num1), diferenca(num,num1), divisao(num,num1), producto(num,num1));
    }
    
}
