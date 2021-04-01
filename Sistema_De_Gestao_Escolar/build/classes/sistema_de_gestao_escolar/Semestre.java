
package sistema_de_gestao_escolar;

public class Semestre {
    private int cadeiras[]=new int[6],nivel;

    public Semestre(int nivel) {
        this.nivel = nivel;
    }
    

    public int[] getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(int[] cadeiras) {
        this.cadeiras = cadeiras;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
}
