/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.api.persistence;

import edu.eci.api.HttpConnection.HttpConnectionExample;
import edu.eci.api.persistence.repositories.IAirportRepository;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
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
    public String getInfo(String city) throws IOException {
        String newInfo = connectionExample.getJson(city);
        return newInfo;//To change body of generated methods, choose Tools | Templates.
    }

}
