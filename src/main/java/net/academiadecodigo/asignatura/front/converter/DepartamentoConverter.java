/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.academiadecodigo.asignatura.front.converter;

import jakarta.ejb.EJB;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.inject.Named;
import net.academiadecodigo.asignatura.front.client.DepartamentoClient;
import net.academiadecodigo.asignatura.front.entities.Departamento;

/**
 *
 * @author cash america
 */
@Named(value = "departamentoConverter")
public class DepartamentoConverter implements Converter<Departamento> {

    @EJB
    DepartamentoClient departamentoCliente;

    @Override
    public Departamento getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        try {
          
            return departamentoCliente.getDepartamentoById(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid value for departamentoConverter: " + value, e);
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Departamento value) {
           if (value instanceof Departamento) {
            return String.valueOf(((Departamento) value).getDeptId());
        }
        return "";
    }

}
