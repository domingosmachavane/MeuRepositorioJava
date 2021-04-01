
package gereestudante;

/**
 *
 * @author Domingos Machavane
 */
import java.io.*;

public class Validacoes {
    private BufferedReader br;
	
    public Validacoes(){
        br=new BufferedReader(new InputStreamReader(System.in));
		}
		
      public String validarString(String m, byte a,byte b){
        String j="";
            do{
                try{
                        System.out.println(m);
                        j=br.readLine();
                        System.out.println(j);
                }catch(IOException io){System.out.println(io.getMessage());}
				
				if (j.length()<a||j.length()>b)
					System.out.println("A extesao do nome devera "
							+ "pertencer ao intervalo de ["+a+"-"+b+"]");
}while(j.length()<a||j.length()>b);
    return j;
    }
		
public float validarFloat(String k,int m, int n){
    float c=0;
        do{
try{
System.out.println(k);
c=Float.parseFloat(br.readLine());
System.out.println(c);
}catch(NumberFormatException nfe)
{System.out.println(nfe.getMessage());
}catch(IOException ioe)
{System.out.println(ioe.getMessage());}
				
if ((c<m||c>n))
System.out.println("Valor introduzido fora"
+ " do do intervalo ["+m+"-"+n+"]");
}while((c<m||c>n));
return c;
}
		
public short validarShort(String sms, short min, short max) {
short n=0;
do {
				System.out.println(sms);
				try {
					n=Short.parseShort(br.readLine());
				}catch(NumberFormatException nu) {
					System.out.println(nu.getMessage());
				}catch(IOException io) {
					System.out.println(io.getMessage());
				}
				
				if(n<min || n>max) {
					System.out.println("Numero invalido!"
									+ "Tente novamente.");
				}
			}while(n<min || n>max);
			return n;
		}//Fim do metodo validarShort
		
		//Metodo para validar dado do tipo inteiro
		public int validarInt(String sms, int min, int max) {
			int n=0;
			do {
				System.out.println(sms);
				try {
					n=Integer.parseInt(br.readLine());
				}catch(NumberFormatException nu) {
					System.out.println(nu.getMessage());
				}catch(IOException io) {
					System.out.println(io.getMessage());
				}
				
				if(n<min || n>max) {
					System.out.println("Numero invalido! "
									+ "Tente novamente.");
				}
			}while(n<min || n>max);
			return n;
		}//Fim do metodo validarInt
		
public byte validarByte(String s, byte m, byte x) {
    byte n=0;
        do {
                    System.out.println(s);
                        try {
                                n=Byte.parseByte(br.readLine());
                        }catch(NumberFormatException nu) {
                            System.out.println(nu.getMessage());
				
                        }catch(IOException io) {
                    System.out.println(io.getMessage());
        }
				
if(n<m || n>x) {
					System.out.println("Numero invalido! "
									+ "Tente novamente.");
				}
}while(n<m || n>x);
    return n;
    }//Fim do metodo validarI

    public char validarChar(String m,char k,char l,char t,char q){
            char j=0;
            do{
                try{
                        System.out.println(m);
					j=br.readLine().charAt(0);
					System.out.println(j);
				}catch(IOException io){System.out.println(io.getMessage());}
					if ((j != k && j!=l) && (j!= t &&j!=q))
						System.out.println("A Categoria escolhida não"
								+ "		 é lecionada pela escola");
			}while((j != k && j!=l) && (j!= t &&j!=q));
			return j;
		}
}

