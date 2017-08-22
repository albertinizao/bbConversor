package com.opipo.bbcode.converter;

public class Pair<T extends Object, P extends Object> {
    private T left;
    private P right;

    public Pair(T left, P right){
        this.left=left;
        this.right=right;
    }

    public T getLeft() {
        return left;
    }

    public P getRight() {
        return right;
    }
}
