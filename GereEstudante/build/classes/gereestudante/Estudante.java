
package gereestudante;

/**
 *
 * @author Domingos Machavane
 */
public class Estudante {
    private Validacoes vv;
    private String nome;
    private byte notas[];
    private byte media;

    public Estudante() {
        vv = new Validacoes();
        nome = vv.validarString("Nome de estudante? ",(byte)3,(byte)25);
        byte numNotas = vv.validarByte("Quantas notas?",(byte)0,(byte)5);
        notas = introdNotas(numNotas);
        media = calcMedia(); 
    }
    
//Cria array Notas e preenche com notas do aluno
private byte[] introdNotas(byte numN) {
   // vv = new Validacoes();
    notas = new byte[numN];
    for (int i = 0; i < numN; i++) {
        notas[i] = vv.validarByte("-a nota: ",(byte)0,(byte)20);
    }
    return notas;
}
//devolve uma String composta pelas notas de um estudante
private String verNotas() {
    String visual="";
    for (byte k = 0; k < notas.length; k++)
    visual += notas[k]+" ";
    return visual;
}
// calculo da media
private byte calcMedia() {
    byte soma = 0;
    for (int z=0; z<notas.length; z++)
    soma += notas[z];
    return (byte) Math.round(soma / notas.length);
}
public byte getMedia() {
    return media; }
public String toString() {
    return nome+", notas: "+verNotas()+", Media="+media+"\n";
}



}
