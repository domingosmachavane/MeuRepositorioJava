/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;
import java.io.*;
public class Trabalhador{
private short codigo,idade;
public Trabalhador()throws IOException{
    System.out.println("introduza o codigo(1111-9999);");
    codigo=validarshort((short)1111,(short)9999);
        System.out.println("introduza a idade (18-65);");
    idade=validarshort((short)18,(short)65);
    }
private short validarshort(short a, short b)throws IOException{
short c;
BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
do{
    c=Short.parseShort(y.readLine());
if(c<a||c>b)
        System.out.println("VALOR INVALIDO! TENTE DE NOVO");
}while(c<a||c>b);
return c;
}
public short getidade(){
return idade;
}
public String toString(){
return "codigo\tidade\n"+codigo+"\t"+idade;
}
}