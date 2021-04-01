
package primeiro_programa;
import java.io.*;
import java.util.*;
public class Primeiro_Programa {

    public static void main(String[] args) {
       int v[] = recebeValores( 6);
       for(int i =0; i<v.length; i++){
                   System.out.println(v[i]);
       }
     /*  boolean verifica;
    int vet[ ] = {4,7,4,5};
    int posicao[] = new int[vet.length] , pos ;
    for(int i =0;i<vet.length ; i++){
            if(vet[i] == vet[i+i]){
            
            }
           
    
    }*/
    
          
   
    /*  int vetor [] = new int[5];
      Random rand = new Random();
      for(int i =0 ; i < vetor.length ;i++ ){
            vetor [i] = 1+ rand.nextInt(10);
      }
      for(int i =0 ; i < vetor.length ;i++ ){
            System.out.println(vetor [i] + " ");
      }*/
        
        //String nome = validarString("Informe o nome: ", 4 )
       
       // GravarFicheiro("teste.txt");
        //LerFicheiro("teste.txt");
       // Math.pow(2, 5);
  /*int [] valores = criarArray(5);
        System.out.println("Conteudo do array antes de ordenar:");
        visualizarLista(valores);
        ordenar(valores);
        System.out.println("\n Depois da Ordenacao : ");
        visualizarLista(valores);
     */
        /*String frase = new String("Ola tudo bem contigo");
        frase.length();
        String frase2 = new String("Ola essa e a segunda frase");
        System.out.println("  "+frase2.charAt(0));
        //for(int i = 0; i < frase.length();i++ ){
            //    System.out.printf("  %c",frase.charAt(i));*/
               
        //}
        //System.out.println(" ");
        //int t = frase.indexOf("bem");
        //System.out.println(frase.concat(frase2));
       // System.out.println(frase.substring(0,7));
    }
      public static int[] recebeValores(int tamanho){
          Random rand = new Random();
                   int vetorRecebe [] = new int[tamanho];
                    for(int i = 0; i< tamanho ; i++){
                           vetorRecebe [i] = 1+rand.nextInt(20);
                    }
                return  vetorRecebe;   
            }
    
       public static void GravarFicheiro(String nomeDoFicheiro){
             BufferedReader bb = new BufferedReader( new InputStreamReader(System.in));
           try{
             
String str = "";
               FileWriter fich = new FileWriter(nomeDoFicheiro);
                    BufferedWriter fichout = new BufferedWriter(fich);
                    fichout.write("Domingos Machavane");
                    fichout.newLine();
                   /* for( int i = 0; i <= 15;i++){
                        i = Integer.parseInt(bb.readLine());
                            fichout.write(i);
                            fichout.newLine();
                    }*/
                    fichout.close();
           }catch(IOException fich){
               System.out.println(fich.getMessage());
           }       
       }
       public static void LerFicheiro(String nomeficheiro){
           StringTokenizer str;
               byte cont = 0;
               int  numero;
               long producto = 1;
               String umaLinha = "" , nomeartigo;
               
               try{
                   
                   FileReader fich = new FileReader (nomeficheiro);
                   BufferedReader fichIn = new BufferedReader (fich);
                   
                   umaLinha = fichIn.readLine();
                   
                   while (umaLinha != null){
                       str = new StringTokenizer(umaLinha,";");
                       numero = Integer.parseInt(str.nextToken());
                       nomeartigo = str.nextToken();
                       
                        //producto *= numero;
                       cont += numero;
                       
                       umaLinha = fichIn.readLine();
                   }
                   fichIn.close();
               }catch (FileNotFoundException fn) {System.out.println("Ficheiro nao encontrado");
               } catch (NumberFormatException nn) {System.out.println(nn.getMessage());
               }catch (IOException k) {System.out.println(k.getMessage());}
               System.out.println(producto);
       }
    public static String validarString(String msg, int size){
        BufferedReader x = new BufferedReader (new InputStreamReader(System.in));
        
        String str  = "";
        do{
            try{
                System.out.println(msg);
                str = x.readLine();
            }catch (IOException k) {System.out.println(k.getMessage());}
            
            if (str.length() <= size)
                System.out.println("Nome menor que "+ size);
        }while (str.length() <= size);
        return str;
    }
    public static int[] criarArray(int qua){
        Random rand= new Random();
            int z[] = new int[qua];
            for(byte k=0;k<qua;k++)
                z[k]= rand.nextInt(100);
            return z;
    }
    public static void visualizarLista(int[] y){
            for(int z =0;z<y.length;z++)
                System.out.print(y[z]+" ");
            System.out.println();
    }
    public static void ordenar(int[] x){
            for(int i=0;i<x.length-1;i++){
                    trocarElemento(x,i,indiceMin(x,i,x.length-1));
            }
    }
    public static int indiceMin(int[] w,int inicio,int fim){
            int i_menor=inicio;
            for(int k=inicio+1;k<=fim;k++)
                if(w[i_menor]>w[k])
                    i_menor=k;
            return i_menor;
    }
    public static void trocarElemento(int[] m,int a,int b){
                        int aux=m[a];
                        m[a]=m[b];
                        m[b]=aux;
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
           int valor,soma_digitos = 0;
         Scanner ler = new Scanner(System.in);
         System.out.println("Insira o valor de n:");
         valor=ler.nextInt();
         for(int i =  0; i < valor; i++){
            soma_digitos += i;
             System.out.printf(" %d +",i);
            if(soma_digitos >= valor){
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
