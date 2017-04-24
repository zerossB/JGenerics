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
public interface Lista<E> {

    void push(E element);

    E pop(int index);

    void clear();

    int size();

    boolean isEmpty();

}
