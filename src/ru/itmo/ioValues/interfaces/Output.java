package ru.itmo.ioValues.interfaces;

import ru.itmo.exceptions.NoValueException;

public interface Output {
    Boolean getOutput() throws NoValueException;
}
