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
public interface Fila<E> {
    void push(E element);

    E pop();

    void clear();

    int size();

    boolean isEmpty();
}
