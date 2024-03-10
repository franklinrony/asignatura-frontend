/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package net.academiadecodigo.asignatura.front.controller;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import net.academiadecodigo.asignatura.front.client.MunicipioCliente;
import net.academiadecodigo.asignatura.front.entities.Municipio;

/**
 *
 * @author cash america
 */
@Named(value = "municipioController")
@ViewScoped
public class MunicipioController implements Serializable {

   

    /**
     * Creates a new instance of MunicipioController
     */
    public MunicipioController() {
    }

    @PostConstruct
    public void init() {
    }

  
    
    
}
