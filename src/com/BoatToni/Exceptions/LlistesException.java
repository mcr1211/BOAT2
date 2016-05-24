/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoatToni.Exceptions;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class LlistesException extends Exception {

    /**
     * Creates a new instance of <code>LlistesException</code> without detail
     * message.
     */
    public LlistesException() {
    }

    /**
     * Constructs an instance of <code>LlistesException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LlistesException(String msg) {
        super(msg);
    }
}
