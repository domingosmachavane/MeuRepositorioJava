
package empresacomercial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Operacoes{
    Vector<Vendedor> vendedor = new Vector();
    Vector<PartAdministrativa>  administrativa = new Vector();
    
    Leitura_gravacaoFichObj ler_gravar =  new Leitura_gravacaoFichObj();
    Scanner scanner = new Scanner(System.in);
       public void AdicionaVendas(){
            String nome;
            int id,quantidade;
            System.out.println("Insira o nome do Vendedor que deseja Adicionar Vendas" );
            nome = scanner.next();
            System.out.println("Insira o Id do Vendedor que deseja Adicionar Vendas" );
            id = scanner.nextInt();
            System.out.println("Insira a quantidade" );
            quantidade = scanner.nextInt();
            Vendedor addvenda = new Vendedor(id,nome);
            for(int i=0;i<vendedor.size();i++){
                            if(id == vendedor.get(i).getIdFuncionario() ){
                                   vendedor.get(i).AddVendas(quantidade);
                                    
                            }else{
                                System.out.println("Id Incorreto");
                            }
            }
            
            
    }
   
    public void insercaodadosVendedor(){
        String nome,opcao="sim";
        int IdFuncionario,quant_vendas;
        float Salario_base;
        while(opcao.equalsIgnoreCase("sim") || opcao.equalsIgnoreCase("s")){
        System.out.println("====================Inserir Dados Vendedor====================================");
        try{
        System.out.println("Informe o nome Do funcionario: ");
        nome = scanner.next();
        System.out.println("Informe o idFuncionario : ");
        IdFuncionario = scanner.nextInt();
        System.out.println("Informe o quant vendas: ");
        quant_vendas = scanner.nextInt();
        System.out.println("Informe O Salario base: ");
        Salario_base = scanner.nextFloat();
       
        //int IdFuncionario, String nome,float salarioBase, int totalVendas
        Vendedor vende = new Vendedor(IdFuncionario,nome,Salario_base,quant_vendas);
        vendedor.add(vende);
        ler_gravar.gravarFichObjVendedor("Vendedores.arq", vendedor);
        }catch(Exception msg){
            System.out.println("Erro       : "+msg.getMessage());
        
            }
         System.out.println("Deseja continuar A Inserir Dados do Vendedor [sim/nao || s/n] ");
        opcao= scanner.next();
        }
                
    }
      public void insercaodadosAdministrativa(){
          
        String nome,opcao="sim";
        int IdFuncionario,quant_vendas;
        float Salario_fixo;
        while(opcao.equalsIgnoreCase("sim") || opcao.equalsIgnoreCase("s")){
        System.out.println("==================Inserir Dados da PartAdministrativa===================");
        try{
        System.out.println("Informe o nome Do funcionario: ");
        nome = scanner.next();
        System.out.println("Informe o idFuncionario : ");
        IdFuncionario = scanner.nextInt();
        System.out.println("Informe O Salario base: ");
        Salario_fixo = scanner.nextFloat();
        System.out.println("Deseja continuar?[sim/nao || s/n] ");
        opcao= scanner.next();
        //int IdFuncionario, String nome,float salarioF
        PartAdministrativa admin = new PartAdministrativa(IdFuncionario,nome,Salario_fixo);
       administrativa.add(admin);
       ler_gravar.gravarFichObjAdmistrativa("PartAdministrativa.arq", administrativa);
        }catch(Exception msg){
            System.out.println("Erro       : "+msg.getMessage());
        
            }
        
        }         
    }
      public void imprimeVetorPartAdministrativa () throws ClassNotFoundException, IOException{
          
        Vector<PartAdministrativa> impress = new Vector<>();
       // ler_gravar.lerDadosDoFichObjAdm("PartAdministrativa.dat");
        ler_gravar.lerDadosDoFichObjAdm("PartAdministrativa.dat");
        //leitura.Read("Livros.txt", livrosOb);
        for (int i = 0; i < impress.size(); i++) {
            System.out.println(" =========" + (i + 1) + "===========");
            System.out.println("Nome : " + impress.get(i).getNome());
            System.out.println("IdFuncionario : " + impress.get(i).getIdFuncionario());
            System.out.println("Salario Fixo    : " + impress.get(i).getSalario_Fixo());
            System.out.println("Horas de Trabalho : " + impress.get(i).getHorasTrabExtras());
            System.out.println("Quantidade de Dias : " +impress.get(i).getQuantDias());

        
    }
          
          
          
      
      }
           public void imprimeVetorVendedor (){
          
        Vector<Vendedor> impress = new Vector<>();
        try{
         ler_gravar.lerDadosDoFichObjVendedor("Vendedores.dat" );
        }catch(Exception notfound){
            System.out.println("Ficheiro Nao Encontrado "+notfound.getMessage());           
        }
        //leitura.Read("Livros.txt", livrosOb);
        for (int i = 0; i < impress.size(); i++) {
            System.out.println(" ======= " + (i + 1) + "===========");
            System.out.println("Nome : " + impress.get(i).getNome());
            System.out.println("IdFuncionario : " + impress.get(i).getIdFuncionario());
            System.out.println("Salario Total    : " + impress.get(i).getSalarioBase());
            System.out.println("Horas de Extras Valor : " + impress.get(i).getComisao());
            System.out.println("Quantidade de Vendas : " +impress.get(i).getQuantVendas());

        
    }
           }

   
    
}
