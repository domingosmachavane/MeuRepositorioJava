
package primeiro_programa;
import java.util.Scanner;
import java.math.*;
import java.util.*;
public class Primeiro_Programa {

    public static void main(String[] args) {
        OrdenaMatriz();
        //conversao_binario();
        //amigos();
       // multiplos();
        //somarLimite();
       //mainc();
        //caracterisca();
        //NumPerfeitos();
        //ex3();
        //System.out.println(153%100+" "+153/100+" "+53%10+" "+53/10);
        
        //System.out.println(numeros_primos(5));
       // numerosprimosintervalo();
     
    }
       public static int factorial(int n){
           int fact=1;
           for(int i=1;n>1;n--){    
           fact*=n;
               System.out.print(fact+" * ");
           }
        return fact;
        }
       public static int combinacao(int n , int p){
           int combinacao=factorial(n)/(factorial(p)*factorial(n-p));
           return combinacao; 
       }
       public static void mainc(){
        int valorn,valorp;
        Scanner ler= new Scanner(System.in);
        System.out.println("Insira o valor de n:");
        valorn=ler.nextInt();
        System.out.println("Insira o valor de p:");
        valorp=ler.nextInt();
        if(valorn<valorp)
            System.out.println("Impossivel fazer a combinacao com n menor que p");
        else
            System.out.printf("A combinacao de %d e %d = %d ",valorn,valorp, combinacao(valorn,valorp));
       }
       public static void somarLimite(){
           int valor,soma_digitos=0;
         Scanner ler= new Scanner(System.in);
         System.out.println("Insira o valor de n:");
         valor=ler.nextInt();
         for(int i=0;i<valor;i++){
            soma_digitos+=i;
             System.out.printf(" %d +",i);
            if(soma_digitos>=valor){
                 System.out.println(" a soma e:"+soma_digitos);
                 break;
            }  
            
         }
         
       }
       public static void ex3(){
           int nbinario;
         Scanner input =new Scanner(System.in);
           System.out.println("Insira Um numero Binario:");
           nbinario=input.nextInt();
           if(countZeros(nbinario)!=-1 && countOnes(nbinario)!=-1) {
                System.out.printf(" o numero de zeros do numero %d e :\n ",countZeros(nbinario));
                System.out.printf(" o numero de zeros do numero %d e :\n ",countOnes(nbinario));
                System.out.printf(" o numero de zeros do numero %d e : ",convertBinarytoDecimal(nbinario));
           }else{
               System.out.println("Nao e um numero binario.");
               
           }
            
            
       
       }
       public static int countZeros(int b){
            int nz=0;
            int aux;
            while(b!=0){
                aux=b%10;
                if(aux==1 || aux==0){
                    if(aux==0){
                        nz++;
                    }
                
                }else return -1;
                b=b/10;
            
            }return nz;
       }
              public static int countOnes(int b){
            int no=0;
            int aux;
            while(b!=0){
                aux=b%10;
                if(aux==1 || aux==0){
                    if(aux==1){
                        no++;
                    }
                
                }else return -1;
                b=b/10;
            
            }return no;
       }
              public static int convertBinarytoDecimal(int b){
              int dec=0,p2=1,aux;
              while(b!=0){
                    aux=b%10;
                    dec+=aux*p2;
                    b=b/10;
                    p2=p2*2;
              
              }
              return dec;
              
              
              
              }
       public static  void multiplos(){
           int num, soma=0;
          
           Scanner input =new Scanner(System.in);
           System.out.println("Informe o Numero  : ");
           num=input.nextInt();
           System.out.printf("Os multiplos de %d sao : ",num);
           for(int i=0;i<num;i++){
               if(num*i<100){
                   System.out.print(num*i+" ");
                   soma+=1;
                   if(soma==4)
                       break;
               }
           }
           
           
       
       }
       public static void amigos(){
           int somaN=0,somaM=0,Num1,Num2;
           Scanner scanner =new Scanner(System.in);
           System.out.println("Informe o primeiro numero:");
           Num1=scanner.nextInt();
           System.out.println("Informe o segundo numero:");
           Num2=scanner.nextInt();
           for(int i=1;i<Num1;i++){
               if (Num1%i==0){
                   somaN+=i;
                   System.out.printf(" %d +",i);
               }
           }
           System.out.print(" = "+somaN);
           System.out.println();
            for(int i=1;i<Num2;i++){
                   if (Num2%i==0){
                   somaM+=i;
                   System.out.printf(" %d +",i);
               }
           }
            System.out.print(" = "+somaM);
            System.out.println();
            if(somaN==Num2 && somaM==Num1){
                    System.out.printf("Os numeros %d e %d sao amigos ",Num1,Num2);
            }else{
                System.out.printf("Os numeros %d e %d  nao sao amigos ",Num1,Num2);
            }
           
       }
       public static void NumPerfeitos(){
            int somaN=0,somaM=0,numperfeito;
           Scanner scanner =new Scanner(System.in);
           System.out.println("Informe o  numero:");
           numperfeito=scanner.nextInt();
           if(numperfeito>3){
                for(int i=1;i<numperfeito;i++){
                    if(numperfeito%i==0){
                        somaN+=i;
                        System.out.print(i+"+");
                    }
                }
                System.out.println();
                if(somaN==numperfeito){
                    System.out.printf("O numero %d  e perfeito ",numperfeito);
                }else{
                    System.out.printf("O numero %d  nao e  perfeito ",numperfeito);
                }
           }
            
       }
       public static void caracterisca(){
            int num,aux1,aux2,aux3,aux4,soma;
         
            aux1=0;
            aux2=0;
            aux3=0;
            aux4=0;
              for(int i=100;i<999;i++){
                   aux1=i%100;
                   aux3=i/100;
                   aux2=aux1%10;
                   aux4=aux1/10;
                   soma=(int) (Math.pow(aux3, 3)+Math.pow(aux2, 3)+Math.pow(aux4, 3));
                   if(soma==i){
                       System.out.println("===============================================");
                       System.out.printf("A soma de %d + %d +%d = %d ",aux3,aux4,aux2,soma);
                       System.out.println();
                       System.out.printf("o numero %d e um numero caracteristico pois a soma e = %d\n",i,soma);
                   }//else{
                     //  System.out.println("Nao existe nenhum numero com essa caracteristica");
                   //}
                   
                   
              }
              System.out.println("===============================================");
                   
                   
                  
                  
                 
                   
                      
                 
                
       }
       public static void ReplicacaoDeAlgarismosMenosSignificativos(){
            Scanner scanner = new Scanner(System.in);
            int num,alg,multiplicacao;
            System.out.println("Por favor insira o Vlaor de n: Numero de algarismos significativos. ");
            num=scanner.nextInt();
            System.out.println("Por favor insira o Vlaor de n: Numero de algarismos significativos. ");
            alg=scanner.nextInt();
            multiplicacao=alg*alg;
            System.out.println(multiplicacao);
            
            
       }
       public static int numeros_primos(int x){
           int quant=0;
           for(int i=1;i<=x;i++){
               if(x%i==0){
                    quant++;
               }
               
           }
           if(quant==2)
               return 1;
           else
               return 0;
       
       
       }
        public static void numerosprimosintervalo(){
            int x,i,j;
            Scanner ler = new Scanner(System.in);
            x=ler.nextInt();
           int quant=0;
           for( i=1;i<=x;i++){
               for( j=1;j<i;i++){
                if(x%j==0){
                     quant++;
                }
                
               }
                if(quant==2)
                    System.out.printf("o numero %d eh  primo  ",j);
                else
                    System.out.printf("o numero  %d  nao eh  primo  ",j);
           }
          
       
       
       }
        public static void OrdenaMatriz(){
                Random random = new Random();
                int array[][]= new int[7][4];
                int somaLinhas1=0,somaLinhas2=0,somaLinhas3=0,somaLinhas4 =0;
                int arrayOrdem[][] = new int[7][4];
                Scanner leitura =new Scanner(System.in);
                for(int i=0;i<7;i++){
                        for(int j=0;j<4;j++){
                                System.out.printf("Insira o valor da matriz na posicao: [%d][%d] ",i,j);
                                array[i][j]=1+random.nextInt(29);
                        }
                        System.out.println();
                }
                //Nao ordenado em ordem crescente de somatorios das linhas
                  for(int i=0;i<7;i++){
                        for(int j=0;j<4;j++){
                            System.out.print(array[i][j]+" ");
                        }
                        System.out.println();
                }
                 //Ordenando em Ordem Crescente De somatorios de Linha
                    for(int i=0;i<7;i++){
                        for(int j=0;j<4;j++){
                            
                        }
                        System.out.println();
                }  
                
        
        
        }
       
       
    
}
