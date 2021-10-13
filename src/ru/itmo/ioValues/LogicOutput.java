package ru.itmo.ioValues;

import ru.itmo.exceptions.NoValueException;
import ru.itmo.ioValues.interfaces.IOElement;
import ru.itmo.ioValues.interfaces.LogicFunctionInput;

public class LogicOutput implements LogicFunctionInput {

    IOElement<?> element;
    private final String name;

    public LogicOutput(String name){
        this.name = name;
    }

    @Override
    public void setInput(IOElement<?> input) {
        this.element = input;
    }

    @Override
    public Boolean getOutput() throws NoValueException {
        if (element != null) {
            return element.getOutput();
        } else {
            throw new NoValueException("");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
