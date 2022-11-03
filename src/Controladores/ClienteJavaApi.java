/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Estudiante;
import Servicios.Servicio;

/**
 *
 * @author pipet
 */
public class ClienteJavaApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String server="https://e7c05ffe-10ff-486b-9ef2-d46211e961a3.mock.pstmn.io/";
        Servicio elServicio=new Servicio(server);
        ControladorEstudiante elControladorEstudiante=new ControladorEstudiante(elServicio);
        Estudiante encotrado=elControladorEstudiante.ver("1");
        System.out.println(""+encotrado.getNombre());
    }
    
}
