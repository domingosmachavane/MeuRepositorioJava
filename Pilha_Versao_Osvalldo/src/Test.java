import java.io.*;

public class Test<T> {
    
    Pilha   pilha, copia;
    
   BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
    
    public Test() {
        pilha = new Pilha();
    }
    
    
 
    public void menu() throws IOException{
        int resp;
        System.out.println("----------------SERVICO DE ENTREGA--------------\n"
                         + "    1-LISTAR TODOS PRODUTOS[LISTAGEM]\n"
                         + "    2-VISUALIZAR O PRODUTO DA PRIMEIRA ENTREGA\n"
                         + "    3-EFECTUAR UMA ENTREGA[PEAK AND POP]\n"
                         + "    4-REGISTAR NOVOS PRODUTO [PUSH]\n"
                         + "    5-CANCELAR ULTIMA ENTREGA [POP]");
        resp=Integer.parseInt(x.readLine());
        switch(resp){
            case 1:
                copia= new Pilha();
                copia=pilha.clone();
                System.out.println(copia.toString());
                break;
            case 4:
                System.out.println("----------------SERVICO DE ENTREGA--------------");
                registar();
                break;
            case 3:
                System.out.println("\n    "+pilha.peekAndPop()+" ENTREGUE COM SUCESSO\n");
                break;
            case 2:
                copia= new Pilha();
                copia=pilha.clone();
                System.out.println(copia.peekAndPop());
                break;
            case 5:
                pilha.pop();
                
            }
        menu();
    }
    
    
    public void registar() throws IOException{
        byte res;
        do{
       String xy;
       
        System.out.println("    REGISTE UM QUE NAO TENHA SIDO REGISTADO");
        xy=x.readLine();
        pilha.push(xy.toUpperCase());
        
        System.out.println("    DESEJA GERISTAR MAIS UM\n   1-SIM\n   2-NAO");
        res=Byte.parseByte(x.readLine());
        }while(res==1);
    }
    
}
