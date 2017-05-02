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
    public E pop(int n) {
        No<E> noAtual;
        No<E> noAnterior;
        noAtual = noAnterior = topo;
        int contador = 1;

        if (!isEmpty() && n <= size()) {
            while (contador <= n) {
                noAnterior = noAtual;
                noAtual = noAtual.prox;
                contador++;
            }
        } else {
            System.err.println("Indice maior que a lista!");
            return null;
        }

        if (size() == 1) {
            topo = fim = null;
        } else {
            if (noAtual == topo) {
                topo = noAtual.prox;
            } else {
                noAnterior.prox = noAtual.prox;
            }
        }

        count--;

        return noAtual.value;
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

    private class No<E> {

        E value;
        No<E> prox;
    }
}
