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
public class TallerException extends Exception {

    /**
     * Creates a new instance of <code>TallerException</code> without detail
     * message.
     */
    public TallerException() {
    }

    /**
     * Constructs an instance of <code>TallerException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TallerException(String msg) {
        super(msg);
    }
}
