package ru.itmo.logicalFunctions;

import ru.itmo.exceptions.NoValueException;

public class AND extends TwoParamsElement {

    public AND(String name) {
        super(name);
    }

    @Override
    public Boolean getOutput() throws NoValueException {
        if(firstInput == null){
            throw new NoValueException("");
        }
        if(secondInput == null){
            throw new NoValueException("");
        }
        return firstInput.getOutput() && secondInput.getOutput();
    }
}
