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
public class LloguerException extends Exception {

    /**
     * Creates a new instance of <code>LloguerException</code> without detail
     * message.
     */
    public LloguerException() {
    }

    /**
     * Constructs an instance of <code>LloguerException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LloguerException(String msg) {
        super(msg);
    }
}
