/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package net.academiadecodigo.asignatura.front.controller;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import net.academiadecodigo.asignatura.front.client.DepartamentoClient;
import net.academiadecodigo.asignatura.front.entities.Departamento;

/**
 *
 * @author cash america
 */
@Named(value = "departamentoController")
@ViewScoped
public class DepartamentoController implements Serializable {

    /**
     * Creates a new instance of DepartamentoController
     */
    public DepartamentoController() {
    }
    

    
    @PostConstruct
    public void init(){
    }
    
   

  
    
    
}
