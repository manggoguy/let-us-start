package com.riotgames.sample;
//Test
public class MyOwnRuntimeException extends RuntimeException{
    public MyOwnRuntimeException(String message) {
        super(message);
    }

    public MyOwnRuntimeException(Throwable cause) {
        super(cause);
    }
}
