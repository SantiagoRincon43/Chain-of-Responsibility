/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.support.handler;

/**
 *
 * @author Santiago
 */

import com.mycompany.support.model.Priority;
import com.mycompany.support.model.Request;

public class Level2SupportHandler extends SupportHandler {

    @Override
    public void handleRequest(Request request) {

        if(request.getPriority() == Priority.INTERMEDIATE) {
            System.out.println("Nivel 2 resolvió la solicitud INTERMEDIATE");
        } else {
            handleNext(request);
        }
    }
}