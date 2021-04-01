
package principal;

public class Menu {
    private Valida v;
    private Tarefas a;
    
    public Menu(){
        v = new Valida();
        a = new Tarefas();
        a.lerObj("DadosObjecto.dat");
        a.lerObj("Consultas.txt");
    }
    
    //MENU GERAL
    public void menuGeral(){
        int op = 0;
        
        do{
            System.out.println(""
                +"*********MENU GERAL*********\n"
                +"*     1. Administrador.    *\n"
                +"*     2. Medico.           *\n"
                +"*     3. Sair.             *\n"
                +"****************************");
            op = v.validaInt("Escolha uma opcao[1-3]:", 1, 3);
            switch(op){
                case 1: apresentarMenu(1);break;
                case 2: apresentarMenu(2);break;
                case 3: System.exit(0);break;
            }
        }while(op != 3);
    }
    
    /*METODO(apresentrarMenu(int opcao)) PARA APRESENTAR MENUS ESPECIFICOS
    ONDE: 0 - INDICA QUE OS DADOS DE LOGIN ESTAO ERRADOS;
          1 - INDICA QUE SAO DADOS DE LOGIN DE UM ADMINISTRADOR;
          2 - INDICA QUE SAO DADOS DE LOGIN DE UM MEDICO;
    */
    public void apresentarMenu(int opcao){
        int verifica;

            verifica=a.entrar();
            if(verifica==0){
                System.out.println("Senha Errada ou ID Errada! Verique Correctamente");
            }
            else if(verifica == 1 && opcao == 2){
                System.out.println("ERRO! Verifique os dados Inseridos!");
            }
            else if(verifica == 1 && opcao == 1){
                menuAdmin();
            }
            else if( verifica == 2 && opcao == 2){
                menuMedico();
            }
    }
    
    // MENU ADMINISTRADOR
    private void menuAdmin(){
        int op = 0;
        do{
            System.out.println("**********BEM VINDO AO SISTEMA DE GESTAO*************");
            System.out.println("\tMENU ADMINISTRADOR"
                    + "*******************************************\n"
                    + "*    1.  Adicionar Administrador.         *\n"
                    + "*    2. Visualizar Administradores.       *\n"
                    + "*    3. Adicionar Medico.                 *\n"
                    + "*    4. Alterar Dados Medico.             *\n"
                    + "*    5. Visualizar Medicos.               *\n"
                    + "*    6. Voltar Menu Geral.                *\n"
                    + "*    7. Sair.                             *\n"
                    + "*******************************************");
            op = v.validaInt("Escolha Opcao [1-7]: ", 1, 7);
            switch(op){
                case 1: a.adicionarInformacao(3);break;
                case 2: a.showInfo(3); break;
                case 3: a.adicionarInformacao(2);break;
                case 5: a.showInfo(2);break;
                case 6: menuGeral(); break;
                case 7: System.exit(0);break;
            }
        }while(op != 7);
    }
    
    //METODO PARA MENU DO MEDICO
    private void menuMedico(){
        int opc;
        do{
            v.imprimir(""
            +"****************** MENU MEDICO*********************\n"
            +"*           1- Adicionar Pacientes.               *\n"
            +"*           2- Remover Paciente.              *\n"
            +"*           3- Visualizar Paciente.               *\n"
            +"*           4- Marcar Consulta.                   *\n"
            +"*           5- Ver Consultas Marcasdas.           *\n"
            +"*           6 - Voltar Menu Geral.                *\n"
            +"*           7-Terminar.                           *\n"    
            +"***************************************************\n");
            opc = v.validaInt("Escolha Opcao:", 1, 7);
            switch(opc){
                case 1: a.adicionarInformacao(1);break;
                case 2: 
                    a.showInfo(1);
                    a.remove();break;
                case 3: a.showInfo(1);break;
                case 4: a.marcarCon();break;
                case 5: a.mostrarConsultas();break;
                case 6: menuGeral();break;
                case 7: System.exit(0);break;
            }
        }while( opc != 7);
    }
}
