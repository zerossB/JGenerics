/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgenerics.pilha;

/**
 *
 * @author haynes
 */
public class PilhaEncadeada<E> implements Pilha<E> {

    private No<E> topo;
    private int count;

    @Override
    public void push(E element) {
        No<E> n = new No<>();
        if (isEmpty()) {
            n.value = element;
            topo = n;
        } else {
            n.value = element;
            n.prox = topo;
            topo = n;
        }
        count++;
    }

    @Override
    public E pop() {
        E element = null;
        if (!isEmpty()) {
            element = topo.value;
            topo = topo.prox;
            count--;
        }
        return element;
    }

    @Override
    public void clear() {
        topo = null;
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
                sb.append(aux.value.toString());
                if (i < count - 1) {
                    sb.append(" | ");
                }
                aux = aux.prox;
            }
        }else{
            sb.append("Pilha vazia!");
        }
        sb.append(" ]");
        return sb.toString();
    }

    private class No<e> {

        E value;
        No<E> prox;

    }
}
