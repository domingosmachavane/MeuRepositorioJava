
package projectoeda;

public class PilhaAdministrador {
    public Object[] vetorAdmin;
    public int indice;
    public PilhaAdministrador(){
                this.indice = -1;
                this.vetorAdmin = new Object[100];
    }
        public boolean isEmptyAdmin(){ //verifica se esta vazia
                if(this.indice == -1)
                {
                        return true;
        }
                return false;
                
    }
    public int SizeAdmin(){// verifica o tamanho
                if(this.isEmptyAdmin()){
                        return 0;
                }
                return this.indice+1;
    }
    public Object topAdmin(){
            if(isEmptyAdmin()){
                        return null;
            } return this.vetorAdmin[this.indice];
    }
    public Object popAdmin(){
            if(isEmptyAdmin()){
                        return null;
            }
            
            Object dado =  this.vetorAdmin[this.indice];
            indice--;
            return dado;
            
            
    }
    public void pushAdmin(Object valor){
                if(this.indice< this.vetorAdmin.length-1){
                        this.vetorAdmin[++indice] = valor;
                }
    }
}
