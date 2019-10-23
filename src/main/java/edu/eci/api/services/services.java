/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.api.services;

import edu.eci.api.persistence.repositories.IAirportRepository;
import edu.eci.api.services.contracts.IAppServices;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luisp
 */
@Service
public class services implements IAppServices {

    @Autowired
    IAirportRepository aiportRepository;

    @Override
    public String getHttpConnection(String city) {
        try {
            return aiportRepository.getInfo(city);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

 

}
