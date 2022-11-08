/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Estudiante;
import Servicios.Servicio;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author pipet
 */
public class ControladorEstudiante {

    Servicio servicioEstudiante;

    public ControladorEstudiante(Servicio servicioEstudiante) {
        this.servicioEstudiante = servicioEstudiante;
    }

    public boolean crear(Estudiante elEstudiante) {
        boolean respuesta = false;

        return respuesta;
    }

    public Estudiante ver(String id) {
        Estudiante elEstudiante = null;
        String respuesta = servicioEstudiante.GET("students/" + id);
        try {
            JSONParser parser = new JSONParser();
            JSONObject estudianteJSON = (JSONObject) parser.parse(respuesta);
            elEstudiante = new Estudiante();
            elEstudiante.toObject(estudianteJSON);
        } catch (Exception e) {
            System.out.println("error " + e);
        }

        return elEstudiante;
    }

    public LinkedList<Estudiante> listar() {
        LinkedList<Estudiante> losEstudiantes = new LinkedList<>();
        String respuesta = servicioEstudiante.GET("students");
        System.out.println(""+respuesta);
        try {
            JSONParser parser = new JSONParser();
            JSONArray estudiantesJSON = (JSONArray) parser.parse(respuesta);
            for (Object estudianteJSON : estudiantesJSON) {
                Estudiante elEstudiante = new Estudiante();
                elEstudiante.toObject((JSONObject)estudianteJSON);
                losEstudiantes.add(elEstudiante);
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return losEstudiantes;
    }

    public boolean editar(Estudiante elEstudiante) {
        boolean respuesta = false;

        return respuesta;
    }

    public boolean eliminar(Estudiante elEstudiante) {
        boolean respuesta = false;

        return respuesta;
    }

}
