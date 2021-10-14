package ru.itmo.exceptions;

public class UnknownCommand extends  Exception{
    public UnknownCommand(String message){
        super(message);
    }
}
