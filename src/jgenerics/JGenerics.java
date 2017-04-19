/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgenerics;

/**
 *
 * @author aluno
 */
public class JGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>();
        
        pilha.push("Haynes");
        pilha.push("Bruno");
        pilha.push("Pedro");
        pilha.push("Lucio");
        pilha.push("Patrão");
        
        System.out.println(pilha.toString());
        
        pilha.pop();
        
        System.out.println(pilha.toString());
        
    }

}
