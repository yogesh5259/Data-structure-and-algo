package com.data.ArrayList;

import java.util.Objects;

public interface List<E> extends Iterable<E> {
    int size();

    boolean isEmpty();

    E get(int index);

    void set(int index, E elem);

    void clear();

    void add(E elem);

    E removeAt(int index);

    boolean remove(Object obj);

    int indexOf(Object obj);

    boolean contains(Object obj);


}
