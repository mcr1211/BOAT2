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
public class TargetaException extends Exception {

    /**
     * Creates a new instance of <code>TargetaException</code> without detail
     * message.
     */
    public TargetaException() {
    }

    /**
     * Constructs an instance of <code>TargetaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public TargetaException(String msg) {
        super(msg);
    }
}
