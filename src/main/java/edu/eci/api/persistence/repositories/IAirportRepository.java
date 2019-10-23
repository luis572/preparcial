package edu.eci.api.persistence.repositories;

import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

public interface IAirportRepository {
	public String getInfo(String city) throws IOException;
}
