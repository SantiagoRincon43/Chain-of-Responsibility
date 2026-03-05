/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.support.handler;

import com.mycompany.support.model.Request;

/**
 *
 * @author DANIE
 */
public abstract class SupportHandler {

    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void handleNext(Request request) {
        if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    public abstract void handleRequest(Request request);
}
