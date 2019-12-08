package com.company.arrays.sort.clas;

public class HobbyExeptions extends Exception {

    public HobbyExeptions() {
    }

    public HobbyExeptions (String message) {
        super (message);
    }

    public HobbyExeptions(Throwable cause) {
        super(cause);
    }

    public HobbyExeptions(String message, Throwable cause) {
        super(message, cause);
    }

    public HobbyExeptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
