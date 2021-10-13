package ru.itmo.ioValues;

import ru.itmo.exceptions.NoValueException;
import ru.itmo.ioValues.interfaces.LogicInput;

public class LogicValue implements LogicInput{

    private Boolean value;
    private final String name;

    public LogicValue(String name){
        this.name = name;
    }

    @Override
    public void setInput(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean getOutput() throws NoValueException {
        if (value != null){
            return value;
        } else {
            throw new NoValueException("");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
