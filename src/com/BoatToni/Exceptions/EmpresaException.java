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
public class EmpresaException extends Exception {

    /**
     * Creates a new instance of <code>EmpresaException</code> without detail
     * message.
     */
    public EmpresaException() {
    }

    /**
     * Constructs an instance of <code>EmpresaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmpresaException(String msg) {
        super(msg);
    }
}
