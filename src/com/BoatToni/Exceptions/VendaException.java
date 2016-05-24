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
public class VendaException extends Exception {

    /**
     * Creates a new instance of <code>VendaException</code> without detail
     * message.
     */
    public VendaException() {
    }

    /**
     * Constructs an instance of <code>VendaException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public VendaException(String msg) {
        super(msg);
    }
}
