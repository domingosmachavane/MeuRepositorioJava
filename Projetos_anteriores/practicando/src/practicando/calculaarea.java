
package practicando;
import java.io.*;

public class calculaarea {
    //atributos
    private float lado1;
    private float lado2;
    private float altura;
    
    public calculaarea(float lado1, float lado2, float lado3) {
        float area;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = lado3;
        area=(lado1+lado2)*altura/2;
        System.out.println("======================================");
        System.out.println(" a area da figura com lado1=  "+this.lado1);
        System.out.println("e o lado2 ="+this.lado2);
        System.out.println("e altura = "+this.altura);
        System.out.println(" e igual a "+area);
        System.out.println("========================================");
       
    } 

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
   

    
}
