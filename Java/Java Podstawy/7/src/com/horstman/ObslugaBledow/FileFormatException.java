package com.horstman.ObslugaBledow;

import java.io.IOException;

class FileFormatException extends IOException {
    public FileFormatException() {
    }

    public FileFormatException(String gripe) {
        super(gripe);
    }
}

