/*
 * Copyright (C) 2017 haynes
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package jgenerics.lista;

/**
 *
 * @author haynes
 */
public class ListaSequencial<E> implements Lista<E> {

    private E[] lista;
    private int count;

    public ListaSequencial() {
        lista = (E[]) new Object[1];
    }

    @Override
    public void push(E element) {
        if (isEmpty()) {
            lista[0] = element;
        } else {
            lista[count] = element;
        }
        count++;
        resize();
    }

    @Override
    public E pop(int n) {
        E ele = null;
        if (!isEmpty() && n < size()) {
            ele = get(n);
            int aux = n - 1;
            for (int i = aux; i < size(); i++) {
                lista[i] = lista[++aux];
            }
        }
        count--;
        resize();
        return ele;
    }

    public E get(int n) {
        E ele = null;
        if (!isEmpty() && n < size()) {
            ele = lista[n - 1];
        }
        return ele;
    }

    @Override
    public void clear() {
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    private void resize() {
        E[] newLista = (E[]) new Object[count + 1];
        for (int i = 0; i < size(); i++) {
            newLista[i] = lista[i];
        }
        lista = newLista;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        if (!isEmpty()) {
            for (int i = 0; i < size(); i++) {
                sb.append(lista[i]);
                if (i < count - 1) {
                    sb.append(" | ");
                }
            }
        } else {
            sb.append("Lista vazia!");
        }
        sb.append(" ]");
        return sb.toString();
    }
}
