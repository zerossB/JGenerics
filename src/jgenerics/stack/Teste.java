/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgenerics.stack;

/**
 *
 * @author haynes
 */
public class Teste {
    
    public static void main(String[] args){
        Pilha<String> pilha = new PilhaEncadeada<>();
        
        pilha.push("Haynes");
        pilha.push("Bruno");
        pilha.push("Pedro");
        pilha.push("Lucio");
        pilha.push("Patrão");
        
        System.out.println(pilha.toString()+"\n");
        
        String nome = pilha.pop();
        System.out.println(pilha.toString()+"\n");
        
        pilha.clear();
        System.out.println(pilha.toString());
    }
}
