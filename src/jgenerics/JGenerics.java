package jgenerics;

import jgenerics.lista.Lista;
import jgenerics.lista.ListaEncadeada;

/**
 *
 * @author aluno
 */
public class JGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista<String> lista = new ListaEncadeada<>();

        lista.push("Marco");
        lista.push("Mirela");
        lista.push("Haynes");
        lista.push("Raiane");
        
        System.out.println(lista.toString());
        System.out.println(lista.pop(1));
        System.out.println(lista.toString());
    }
}
