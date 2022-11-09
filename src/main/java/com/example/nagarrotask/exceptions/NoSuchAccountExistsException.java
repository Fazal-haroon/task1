package com.example.nagarrotask.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoSuchAccountExistsException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String message;

    public NoSuchAccountExistsException() {
    }

    public NoSuchAccountExistsException(String message) {
        super(message);
        this.message = message;
    }
}

