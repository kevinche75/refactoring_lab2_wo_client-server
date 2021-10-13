package ru.itmo.ioValues.interfaces;

public interface LogicFunctionInput extends IOElement<IOElement<?>>{

    @Override
    void setInput(IOElement<?> value);
}
