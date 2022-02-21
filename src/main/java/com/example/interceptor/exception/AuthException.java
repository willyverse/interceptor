package com.example.interceptor.exception;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthException extends RuntimeException{

    private String msg;

    public AuthException(String msg) {
        log.info(msg);
    }


}
