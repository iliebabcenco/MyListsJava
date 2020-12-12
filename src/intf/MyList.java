package intf;

public interface MyList<E> {

    void add(E e);
    void remove(E e);
    void set (int index);
    MyList<E> get(int index);
    int size();

}
