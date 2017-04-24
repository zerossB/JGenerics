/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgenerics.fila;

/**
 *
 * @author haynes
 */
public class FilaEncadeada<E> implements Fila<E> {

    private No<E> inicio;
    private No<E> fim;
    private int count;

    @Override
    public void push(E element) {
        No<E> no = new No();
        no.value = element;
        if (isEmpty()) {
            inicio = no;
            fim = inicio;
        } else {
            fim.prox = no;
            fim = no;
        }
        count++;
    }

    @Override
    public E pop() {
        E value = null;
        if (!isEmpty()) {
            value = inicio.value;
            inicio = inicio.prox;
            count--;
        }
        return value;
    }

    @Override
    public void clear() {
        inicio = fim = null;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        if (!isEmpty()) {
            No<E> aux = inicio;
            for (int i = 0; i < count; i++) {
                sb.append(aux.value);
                if (i < count - 1) {
                    sb.append(" | ");
                }
                aux = aux.prox;
            }
        } else {
            sb.append("Fila vazia!");
        }
        sb.append(" ]");
        return sb.toString();
    }

    private class No<E> {

        E value;
        No<E> prox;
    }
}
