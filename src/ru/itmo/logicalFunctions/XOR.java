package ru.itmo.logicalFunctions;

import ru.itmo.exceptions.NoValueException;

public class XOR extends TwoParamsElement {

    public XOR(String name) {
        super(name);
    }

    @Override
    public Boolean getOutput() throws NoValueException {
        if (firstInput == null){
            throw new NoValueException("");
        }
        if (secondInput == null){
            throw new NoValueException("");
        }
        return firstInput.getOutput() ^ secondInput.getOutput();
    }
}
