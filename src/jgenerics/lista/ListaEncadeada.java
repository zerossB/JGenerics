/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgenerics.lista;

/**
 *
 * @author haynes
 */
public class ListaEncadeada<E> implements Lista<E> {

    private No<E> topo;
    private No<E> fim;
    private int count;

    @Override
    public void push(E element) {
        No<E> n = new No();
        n.value = element;
        if (isEmpty()) {
            topo = n;
            fim = n;
        } else {
            fim.prox = n;
            fim = n;
        }
        count++;
    }

    @Override
    public E pop(int index) {
        E ele = null;
        if (index <= count) {
            No<E> aux = null;
            No<E> aux1 = topo;
            for (int i = 0; i < index; i++) {
                aux = aux1;
                aux1 = aux1.prox;
            }
            ele = aux.value;
            
        }
        count--;
        return ele;
    }

    @Override
    public void clear() {
        topo = fim = null;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        if (!isEmpty()) {
            No<E> aux = topo;
            for (int i = 0; i < count; i++) {
                sb.append(aux.value);
                if (i < count - 1) {
                    sb.append(" | ");
                }
                aux = aux.prox;
            }
        } else {
            sb.append("Lista vazia!");
        }
        sb.append(" ]");
        return sb.toString();
    }

    private class No<e> {

        E value;
        No<E> prox;
    }
}
