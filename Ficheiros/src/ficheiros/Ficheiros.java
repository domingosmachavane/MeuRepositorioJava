package ficheiros;
public class Ficheiros {
    public static void main(String[] args) {
        String arq="test.txt";
      /*  String texto="a mDurante a execução de um programa, seja "
                    + "necessário tomar decisões em função de valores fornecidos pelo "
                    + "utilizador ou de resultados previamente calculados. Este tipo "
                    + "de decisões"
                    + " é representado"
                    + " por estructuras de controlo (estruturas de selecção)";
        if(Arquivo.write(arq,texto)){
            System.out.println("Salvo com sucesso");
        }else{
            System.out.println("Ocorreu um Erro");
        }
                 */
        String texto=Arquivo.Read(arq);
        if(texto.isEmpty())
            System.out.println("Erro ao ler o arquivo");
        else
            System.out.println(texto);
    }
    
}
