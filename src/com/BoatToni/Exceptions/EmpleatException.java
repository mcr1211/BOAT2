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
public class EmpleatException extends Exception {

    /**
     * Creates a new instance of <code>EmpleatException</code> without detail
     * message.
     */
    public EmpleatException() {
    }

    /**
     * Constructs an instance of <code>EmpleatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmpleatException(String msg) {
        super(msg);
    }
}
