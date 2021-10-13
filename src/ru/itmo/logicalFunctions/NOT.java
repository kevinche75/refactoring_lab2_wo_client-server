package ru.itmo.logicalFunctions;

import ru.itmo.exceptions.NoValueException;
import ru.itmo.ioValues.interfaces.IOElement;
import ru.itmo.ioValues.interfaces.LogicFunctionInput;

public class NOT implements LogicFunctionInput {

    private final String name;
    IOElement<?> input;

    public NOT(String name){
        this.name = name;
    }

    @Override
    public void setInput(IOElement<?> value) {
        input = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Boolean getOutput() throws NoValueException {
        if (input == null){
            throw new NoValueException("");
        }
        return !input.getOutput();
    }
}
