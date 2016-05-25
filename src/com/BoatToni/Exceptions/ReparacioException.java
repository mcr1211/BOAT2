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
public class ReparacioException extends Exception {

    /**
     * Creates a new instance of <code>RepaticioException</code> without detail
     * message.
     */
    public ReparacioException() {
    }

    /**
     * Constructs an instance of <code>RepaticioException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ReparacioException(String msg) {
        super(msg);
    }
}
