
package main;

import java.io.*;


public class Auxiliar<T> {
    Pilha <String> pilha,copia;
   BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
    
    public Auxiliar() {
        pilha=new Pilha();
    }
    
    
 
    public void menu() throws IOException{
        int resp;
        try{
        System.out.println("----------------SERVICO DE ENTREGA--------------\n"
                         + "    1-LISTAR TODOS PRODUTOS[LISTAGEM]\n"
                         + "    2-VISUALIZAR O PRODUTO DA PRIMEIRA ENTREGA\n"
                         + "    3-EFECTUAR UMA ENTREGA[PEAK AND POP]\n"
                         + "    4-REGISTAR NOVOS PRODUTO [PUSH]\n"
                         + "    5-CANCELAR ULTIMA ENTREGA [POP]\n"
                         + "    6-SAIR");
        resp=Integer.parseInt(x.readLine());
        switch(resp){
            case 1:
                copia= new Pilha();
                copia=pilha.clone();
                System.out.println("    "+copia.toString());
                break;
                 case 2:
                copia= new Pilha();
                copia=pilha.clone();
                System.out.println("    "+copia.peekAndPop());
                break;
                case 3:
                System.out.println("\n    "+pilha.peekAndPop()+" ENTREGUE COM SUCESSO\n");
                break;
            case 4:
                System.out.println("----------------SERVICO DE ENTREGA--------------");
                registar();
                break;
            case 5:
                pilha.pop();
                break;
            case 6:
                System.exit(0);
                
            }
        menu();
        }catch(NumberFormatException v){
            System.out.println(v.getMessage()+"TENTE NOVAMENTE! E INSIRA UM NUMERO");
        }catch(IOException vv){
            System.out.println(vv.getMessage());
        }
    }
    
    
    public void registar() {
        byte res;
        try{
        do{
       String produto;
       
        System.out.println("    REGISTE UM PRODUTO QUE NAO TENHA SIDO REGISTADO");
        produto=x.readLine();
        pilha.push(produto.toUpperCase());
        
        System.out.println("    DESEJA GERISTAR MAIS UM\n   1-SIM\n   2-NAO");
        res=Byte.parseByte(x.readLine());
        }while(res==1);
        }catch(NumberFormatException v){
            System.out.println(v.getMessage());
        }catch(IOException s){
            System.out.println(s.getMessage());
        }
    }
    
}

