/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgenerics;

/**
 * Classe exemplo de uso do Generics
 * 
 * Utilizamos um exemplo de Pilha
 * 
 * @author Guilherme Hayens
 * @author Lucio Sam
 * @param <T> Tipo da Pilha
 */
public class Pilha<T> {
    
    //Minha pilha
    private T[] elements;
    //Contador da Pilha
    private int count;
    
    /**
     * Construtor
     * 
     * Cria uma pilha vazia p/ 10 elementos
     */
    public Pilha() {
        elements = (T[]) new Object[10];
        count = 0;
    }
    
    /**
     * Inserir elemento na Pilha
     * 
     * @param element 
     * @return Elemetno inserido
     */
    public T push(T element) {
        if (element == null) {
            throw new IllegalArgumentException("O elemento não pode ser nulo!");
        }
        if (count == elements.length) {
            return null;
        }
        count++;
        elements[getTopPosition()] = element;
        return element;
    }
    
    /**
     * Método utilizado para se obter o elemento que está no topo desta pilha,
     *  porém, sem removê-lo da mesma. -Se a pilha estiver vazia, retornamos null
     *  para indicar que a pilha está vazia. -Se houver ao menos um elemento na
     *  pilha, o elemento que está no topo será retornado, indicando o sucesso da
     *  operação
     * 
     * @return T
     */
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return elements[getTopPosition()];
    }
    
    /**
     * Remove Elemento da Pilha
     * 
     * @return Elemento Removido
     */
    public T pop() {
        T result = peek();
        /*Se havia um elemento no topo da pilha...*/
        if (result != null) {
            elements[getTopPosition()] = null;
            count--;
        }
        return result;
    }
    
    /**
     * Limpa Pilha
     */
    public void clear() {
        for (int i = 0; i < count; i++) {
            elements[i] = null;
        }
        count = 0;
    }
    
    /**
     * Tamanho da Pilha
     * 
     * @return length Pilha
     */
    public int getSize() {
        return count;
    }
    
    /**
     * Capacidade da Pilha
     * 
     * @return length Capacidade
     */
    public int getCapacity() {
        return elements.length;
    }
    
    /**
     * Se a pilha está vazia
     * 
     * @return boolean
     */
    public boolean isEmpty() {
        return count <= 0;
    }
    
    /**
     * Posição do primeiro elemento da Pilha
     * 
     * @return posição
     */
    private int getTopPosition() {
        if (isEmpty()) {
            return 0;
        }
        return count - 1;
    }

    /**
     * To String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            sb.append(elements[i]);
            if (i < count - 1) {
                sb.append(" | ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
