package ru.itmo.ioValues.interfaces;

public interface IOElement extends NamedElement, Output{

    void setInput(Object input);
    String getCommandName();
    String getFullName();
}
