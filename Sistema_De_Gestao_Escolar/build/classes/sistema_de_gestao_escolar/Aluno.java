
package sistema_de_gestao_escolar;

import java.util.Scanner;

public class Aluno extends Pessoa{
    private int nivel;
    private String curso,turno;
    private boolean resultado;
    private float notas[]=new float[12];

   

    public Aluno(int nivel, String curso, String turno, boolean resultado, String nome, String data_nascimento, String numero_bi, String estado_civil) {
        super(nome, data_nascimento, numero_bi, estado_civil);
        this.nivel = nivel;
        this.curso = curso;
        this.turno = turno;
        this.resultado = resultado;
    }
    public void PagarMensalidade(){
        float payment;
            if(this.getTurno().equals("Laboral")){
                payment=400;
                
                    
            }else 
                if(this.getTurno().equals("Pos-Laboral")){
                    payment=1400;
                }
            
            }
    
    public void CancelarMatricula(){
        String confirm;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tu tens a certeza de que deseja continuar?");
        confirm=scanner.next();
        if(confirm.equals("sim")){
                System.out.println("cancelado com sucesso");
        }else{
                System.out.println("Impossivel cancelar Agora");
        }
        
            
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public boolean getResultado() {
        Teste teste = new Teste(13,15);
      float trab[] = new float [2];
      trab[0]=13;
      trab[1]=15;
        if(this.resultado==true && teste.Media(13, 15, trab)>10 ){
        System.out.println("Passou");
        }else{
            System.out.println("Chumbou");
        }
        
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    
    
    
}
