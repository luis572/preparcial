/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.api.persistence;

import edu.eci.api.HttpConnection.HttpConnectionExample;
import edu.eci.api.persistence.repositories.IAirportRepository;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author luisp
 */
@Component
public class inMemoryAirports implements IAirportRepository {

    ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
    ConcurrentHashMap<String, Long> mapTime = new ConcurrentHashMap<>();
    @Autowired
    HttpConnectionExample connectionExample;

    @Override
    public String getInfo(String city) throws IOException, MalformedURLException {
        String newInfo;
        try {
            newInfo = connectionExample.getJson(city);
            return newInfo;
        } catch (JSONException ex) {
            Logger.getLogger(inMemoryAirports.class.getName()).log(Level.SEVERE, null, ex);
        }
        //To change body of generated methods, choose Tools | Templates.
        return null;
    }

}
