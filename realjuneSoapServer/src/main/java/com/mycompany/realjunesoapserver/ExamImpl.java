/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.realjunesoapserver;

import javax.jws.WebService;

/**
 *
 * @author biar
 */
@WebService(endpointInterface = "com.mycompany.realjunesoapserver.Exam")
public class ExamImpl implements Exam {
    @Override
    public Professor getDetails(String id) {
        return Professor.getProfessor(id);
    }
}


