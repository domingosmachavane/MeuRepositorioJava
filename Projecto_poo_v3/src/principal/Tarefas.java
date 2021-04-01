package principal;

import java.util.Vector;

public class Tarefas {

    //Atributos
    private Vector dados;
    private Vector consultas;
    private String []sectores = {"1- Dermatologia", "2- Cardiologia", "3- Odontologia", "4- Neurologia","5- Ginecologia e Obstetricia", "6- Banco de Socorros"};
    private Valida v;
    private int idEntrar, senhaEntrar;
    //Construtores
    public Tarefas() {
        dados = new Vector();
        consultas = new Vector();
        v = new Valida();
    }

    /*METODOS ESPECIFICOS*/
    
    //METODO PARA REMOVER PACIENTE
    public void remove(){
        int remov = 0;
        boolean verificaExistencia = false;
        Pessoa pessoa;
        remov = v.validaInt("Digite o ID do paciente que Deseja Remover: ", 1, 9999);
        for(int i = 0 ; i < dados.size(); i++){
            pessoa = (Pessoa)dados.elementAt(i);
            if(pessoa instanceof Paciente){
                if(remov == pessoa.getId()){
                    dados.remove(i);
                    verificaExistencia = true;
                }
            }
        }
        Consulta con;
        for(int j = 0; j < consultas.size(); j++){
            con = (Consulta)consultas.elementAt(j);
            if(con.getIdPa() == remov){
                consultas.remove(j);
                consultas.trimToSize();
                gravarObj("Consultas.txt");
            }
        }
        
        if(verificaExistencia ==  false){
            System.out.println("O Paciente com o ID: "+remov+", Nao existe!");
        }
    }
    
    //METODO PARA MARCAR CONSULTA
    public void marcarCon(){
        Pessoa pessoa;
        String data = "";
        int sala, idAuxiliar;
        Consulta consulta;
        
        idAuxiliar = v.validaInt("Introduza o ID Paciente: ", 1, 9999);
        for(int j = 0; j <dados.size(); j++){
            pessoa = (Pessoa) dados.elementAt(j);
                if(pessoa instanceof Paciente){
                    if(idAuxiliar == pessoa.getId()){
                        String nome = pessoa.getNome();
                        sala = v.validaInt("Introduza a sala da consulta: ", 1, 5000);
                        data = v.validaData("Introduza a data marcada: ");
                        consulta = new Consulta(idAuxiliar, nome, sala, data);
                        consultas.addElement(consulta);
                    }
                }
        }
        consultas.trimToSize();
        gravarObj("Consultas.txt");
    }
    
    //Metodo para Mostrar as Consultas Marcadas
    public void mostrarConsultas(){
        Consulta c;
        System.out.println("Consultas Marcadas:\n");
        for(int i = 0; i < consultas.size(); i++){
            c = (Consulta)consultas.elementAt(i);
            System.out.println(c.toString());
            System.out.println("***********************************");
        }
    }
    
    /*Metodo para Adicionar dados de cada Objecto PESSOA e armazenar no Vector dados
      
    */
    public void adicionarInformacao(int op) {
        Pessoa pessoa;
        String nome, dataNas, morada, bi, especializacao;
        int celular, id, senha,sector;
        char sexo;
        
        System.out.println("******INTRODUZINDO DADOS******");
        /*PARA GERAR UM ID AUTOMATICAMENTE A PARTIR DO INDICE DO VECTOR*/
        if(dados.isEmpty()){/*SE ESTIVER VAZIO O 1o A SER INTRODUZIDO TERA O ID 1*/
            id = 1;
            }
        else{
            int ultimo_indice = dados.size() - 1;
            pessoa = (Pessoa) dados.elementAt(ultimo_indice);
            id = pessoa.getId()+1;
        }
        /*PEDINDO OS DADOS GERAIS*/
        nome = v.validaString("Nome: ", 3, 100);
        dataNas = v.validaData("Data de Nascimento (formato: DD/MM/ANO): ");
        morada = v.validaString("Morada: ", 3, 1000);
        bi = v.validaString("BI: ", 4, 20);
        celular = v.validaInt("Numero de celular: ", 82, 999999999);
        sexo = v.validaChar("Sexo (f/m): ");
        
        /*OP-> OPCAO:
        1- INDICA ADICIONAR PACIENTE;
        2- INDICA ADICIONAR MEDICO;
        3- INDICA ADICIONAR ADMINISTRADOR;
         */
        switch (op) {
            case 1:
                pessoa = new Paciente(id, nome, dataNas, morada, bi, celular, sexo);
                System.out.println("O SEU ID(IDENTIFICADOR UNICO): "+id);
                dados.addElement(pessoa);
                break;
            case 2:
                especializacao = v.validaString("Especializacao: ", 3, 100);
                senha = v.validaInt("Senha(1000-9999)(NAO ESQUECA DA SENHA!): ", 1000, 9999);
                System.out.println("O SEU ID(IDENTIFICADOR UNICO): "+id);
                for(int i = 0; i <sectores.length; i++){
                    System.out.println(sectores[i]);
                }   sector = v.validaInt("Escolha Um Sector: ", 1, 6);
                pessoa = new Medico(id,nome, dataNas, morada, bi, celular, sexo, especializacao, id, senha, sector);
                dados.addElement(pessoa);
                break;
            case 3:
                senha = v.validaInt("Senha(1000-9999)(NAO ESQUECA DA SENHA!): ", 1000, 9999);
                System.out.println("O SEU ID(IDENTIFICADOR UNICO): "+id);
                pessoa = new Administrador(id, nome, dataNas, morada, bi, celular, sexo, id, senha);
                dados.addElement(pessoa);
                break;
            default:
                break;
        }
        dados.trimToSize();
        gravarObj("DadosObjecto.dat");//Para Gravar Automaticamente cada Objecto
    }
    
    /*PARA SABER SE EH O ADMIN DEFAULT, OU SE PERTENCE A UM ADMIN ADICIONADO
    , OU PARA SABER SE EH UM MEDICO;
    O RETORNO VAI INDICAR QUE TIPO DE CASO EH;
    
    -> 0- PARA O CASO DE A SENHA E O ID NAO BATER EM NENHUM DOS CASOS;
    -> 1- PARA O CASO DE SER UM ADMIN DEFAULT(DO PROGRAMA) OU UM ADMIN ADICIONADO;
    -> 2- PARA O CASO DE SER UM MEDICO;
    */
    public int entrar() {
        Pessoa pessoa;//pessoa VAI FUNCIONAR COMO UM AUXILIAR PARA PODER FAZER AS OPERACOES NECESSARIAS
        
        idEntrar = v.validaInt("Digite o ID: ", 0, 9999);
        senhaEntrar = v.validaInt("Digite a senha  ", 1000, 9999);
        //CASO ADMIN DEFAULT
        if(idEntrar == 1234 && senhaEntrar == 1234){
            return 1;
        }
        //VAI PERCORRENDO E VERIFICANDO;
        for (int i = 0; i < dados.size(); i++) {
            pessoa = (Pessoa) dados.elementAt(i);
            //CASO EH UM ADMINISTRADOR;
            if (pessoa instanceof Administrador) {
                if (((Administrador) pessoa).getId() == idEntrar && ((Administrador) pessoa).getSenha() == senhaEntrar) {
                    return 1;
                }
            } else {
                //CASO SEJA UM MEDICO;
                if (pessoa instanceof Medico) {
                    if (((Medico) pessoa).getId() == idEntrar && ((Medico) pessoa).getSenha() == senhaEntrar) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    /*METODO PARA MOSTRAR INFORMACAO DO PACIENTES OU DE MEDICOS:
    OP-> 1- INDICA QUE QUEREM INFORMACAO DE PACIENTE/S
         2- INDICA QUE QUEREM INFORMACAO DE MEDICO/S
    */
    public void showInfo(int op) {
        Pessoa aux;
        int cont = 1;
        int cont1 = 1;
        for (int i = 0; i < dados.size(); i++) {
            aux = (Pessoa) dados.elementAt(i);
            if (op == 1) {
                if (aux instanceof Paciente) {
                    System.out.println(cont + "-o Paciente: \n" + aux.toString());
                    cont++;
                }
            } else {
                if (op == 2) {
                    if (aux instanceof Medico) {
                        System.out.println(cont1 + "-o Medico: \n" + aux.toString()+""
                                + "Sector: "+sectores[((Medico) aux).getSector()-1]);
                        cont1++;
                    }
                }
            }
        }
    }

    /*Metodos que Invoca a classe Ficheiros para acessar aos Metodos gravar e ler ficheiro*/
    //METODO PARA GRAVAR Obj
    public void gravarObj(String nome) {
        Ficheiros fich = new Ficheiros();
        if("DadosObjecto.dat".equals(nome)){
            fich.gravarObj(dados, nome);
        }else if("Consultas.txt".equals(nome)){
            fich.gravarTxt(consultas, nome);
        }
        
    }

    //METODO PARA LER OBJ
    public void lerObj(String nome) {
        Ficheiros fich = new Ficheiros();
        if("DadosObjecto.dat".equals(nome)){
            dados = fich.lerObj(nome);
        }else if("Consultas.txt".equals(nome)){
            fich.lerTxt(consultas, nome);
        }
    }
}
