/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;


public class Servicio {
    String server = "";
    public Servicio(String server) {
        this.server = server;
    }
    public String GET(String endPoint) {
        StringBuffer response = new StringBuffer();
        try {
            // TODO code application logic here
            URL urlForGetRequest = new URL(this.server+"/"+endPoint);
            System.out.println(""+urlForGetRequest.toString());
            String readLine = null;
            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestMethod("GET");
            int responseCode = conection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
                while ((readLine = in.readLine()) != null) {
                    response.append(readLine);
                }
                in.close();
            } else {
                System.out.println("GET NOT WORKED");
            }
        } catch (MalformedURLException ex) {
            //Logger.getLogger(PreparacionAPI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(PreparacionAPI.class.getName()).log(Level.SEVERE, null, ex);
        }         
        return response.toString();
    }
    private ArrayList<String> getAllKeys(Map theMap) {
        ArrayList<String> keys = new ArrayList<>();
        for (Object theKey : theMap.keySet()) {
            keys.add((String) theKey);
        }
        System.out.println(""+keys);
        return keys;
    }
}
