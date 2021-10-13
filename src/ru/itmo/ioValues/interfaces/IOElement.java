package ru.itmo.ioValues.interfaces;

public interface IOElement<T> extends NamedElement, Output{

    public void setInput(T input);
}
