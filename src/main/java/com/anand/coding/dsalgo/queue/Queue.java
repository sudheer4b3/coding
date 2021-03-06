package com.anand.coding.dsalgo.queue;

/**
 * Queue Interface
 *
 * @param <T>
 */
public interface Queue<T> {

    public void insert(T data);
    public T delete();
    public boolean isEmpty();
    public boolean isFull();
    public void display();
    public int length();
}
