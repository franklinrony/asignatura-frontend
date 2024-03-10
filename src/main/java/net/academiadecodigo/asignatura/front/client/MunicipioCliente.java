/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.academiadecodigo.asignatura.front.client;

import jakarta.ejb.Stateless;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import net.academiadecodigo.asignatura.front.entities.Municipio;

/**
 *
 * @author cash america
 */
@Stateless
public class MunicipioCliente {
    private final String PATH_RS="http://localhost:8081/asignatura-rest/api/v1/";
    
     public List<Municipio> getMunicipios(String id) {
        List<Municipio> municipios = new ArrayList<>();
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(PATH_RS + "municipios/departamento")
                .queryParam("id", id);
                
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        invocationBuilder.header("some-header", "true");

        try {
            Response response = invocationBuilder.get();
            if (response.getStatus() == 200) {
                municipios = response.readEntity(new GenericType<List<Municipio>>() {
                });
            } else {
                // Manejo de errores si la solicitud no es exitosa
                System.out.println("Error al obtener departamentos. Código de estado: " + response.getStatus());
                municipios=null;
            }
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
        } finally {
            client.close(); // Es importante cerrar el cliente cuando hayas terminado
        }

        return municipios;

    }
}
