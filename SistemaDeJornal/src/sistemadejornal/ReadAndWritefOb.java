/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadejornal;

import java.io.*;
import java.util.StringTokenizer;

public class ReadAndWritefOb {

    public static void escreverNum(String nf) {
        StringTokenizer str ;
        String conteudoJornal;
        try {
            FileWriter fw = new FileWriter(nf);
            BufferedWriter fichOut = new BufferedWriter(fw);
            fichOut.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void lerNum(String nomeF) {
        String linha;
        byte cont = 0;
        long prod = 1;
        String umaLinha = "";
        try {
            FileReader fr = new FileReader(nomeF);
            BufferedReader fichIn = new BufferedReader(fr);
            umaLinha = fichIn.readLine();
            while (umaLinha != null) { //ate atingir o fim de ficheiro
                linha = fichIn.readLine();
                System.out.println(linha);
                //prod *= numero;
                //cont++;
                umaLinha = fichIn.readLine();
            }
            fichIn.close();
        } catch (FileNotFoundException fn) {
            System.out.println(" Ficheiro naoencontrado!");
        } catch (NumberFormatException nn) {
            System.out.println(nn.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Produto de " + cont + " numeros=" + prod);
    }
}
