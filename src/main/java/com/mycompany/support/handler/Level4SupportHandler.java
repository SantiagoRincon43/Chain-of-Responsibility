/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.support.handler;

/**
 *
 * @author Santiago
 */

import com.mycompany.support.model.Request;
import com.mycompany.support.model.UrgentRequest;

public class Level4SupportHandler extends SupportHandler {

    @Override
    public void handleRequest(Request request) {

        if(request instanceof UrgentRequest) {
            System.out.println("Nivel 4 resolvió la solicitud URGENT");
        } else {
            handleNext(request);
        }

    }
}