package ru.itmo.logicalFunctions;

import ru.itmo.exceptions.NoValueException;
import ru.itmo.ioValues.interfaces.IOElement;
import ru.itmo.ioValues.interfaces.LogicFunctionInput;

public abstract class TwoParamsElement implements LogicFunctionInput {

    IOElement<?> firstInput;
    IOElement<?> secondInput;
    private final String name;

    public TwoParamsElement(String name){
        this.name = name;
    }

    @Override
    public void setInput(IOElement<?> value) {
        if (firstInput == null){
            firstInput = value;
        } else {
            secondInput = value;
        }
    }

    public void setFirstInput(IOElement<?> value){
        firstInput = value;
    }

    public void setSecondInput(IOElement<?> value){
        secondInput = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract Boolean getOutput() throws NoValueException;
}
