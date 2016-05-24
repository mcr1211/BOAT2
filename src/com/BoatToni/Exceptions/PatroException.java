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
public class PatroException extends Exception {

    /**
     * Creates a new instance of <code>PatroException</code> without detail
     * message.
     */
    public PatroException() {
    }

    /**
     * Constructs an instance of <code>PatroException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public PatroException(String msg) {
        super(msg);
    }
}
