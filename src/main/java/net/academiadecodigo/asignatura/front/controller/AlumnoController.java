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
import net.academiadecodigo.asignatura.front.client.DepartamentoClient;
import net.academiadecodigo.asignatura.front.client.MunicipioCliente;
import net.academiadecodigo.asignatura.front.entities.Alumno;
import net.academiadecodigo.asignatura.front.entities.Departamento;
import net.academiadecodigo.asignatura.front.entities.Municipio;

/**
 *
 * @author cash america
 */
@Named(value = "alumnoController")
@ViewScoped
public class AlumnoController implements Serializable {

    @EJB
    private MunicipioCliente municipioCliente;
    @EJB
    private DepartamentoClient departamentoclient;

    private List<Departamento> departamentos;

    private List<Municipio> municipios;
    private Departamento departamentoSel;
    private Alumno alumno;

    /**
     * Creates a new instance of UsuarioController
     */
    public AlumnoController() {
    }

    @PostConstruct
    public void init() {
        departamentos = new ArrayList<>();
        departamentoSel = new Departamento();
        municipios = new ArrayList<>();
        alumno = new Alumno();
        this.listDepartamentos();
    }

    public void listDepartamentos() {
        departamentos = departamentoclient.getDepartamentos();
    }


    public void municipiosPorDepartamento() {
        municipios = municipioCliente.getMunicipios(departamentoSel.getDeptId().toString());
    }

    public Departamento getDepartamentoSel() {
        return departamentoSel;
    }

    public void setDepartamentoSel(Departamento departamentoSel) {
        this.departamentoSel = departamentoSel;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

}
