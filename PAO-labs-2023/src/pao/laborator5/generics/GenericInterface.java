package pao.laborator5.generics;

public interface GenericInterface<T> {
    T get();

    void add(T t);

    <S> void div(S s);
}
