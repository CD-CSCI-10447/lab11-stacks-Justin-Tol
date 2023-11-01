package edu.desu;

import java.util.EmptyStackException;

public class Stack<T> {
    private Node<T> top;
    private int size;


    public void push(T data) {
        Node<T> oldTop = top;
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(oldTop);
        this.top = newNode;
        size++;
    }

    public T pop() {
        if (this.top != null){
            T data = top.getData();
            top = top.getNextNode();
            size--;
            return data;
        } else {
            throw new EmptyStackException();
        }
    }

    public T peek() {
        if (this.top != null){
            return this.top.getData();
        } else {
            throw new EmptyStackException();
        }
    }

    public Boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }
}

