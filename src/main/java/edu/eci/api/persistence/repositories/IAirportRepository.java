package edu.eci.api.persistence.repositories;

import java.io.IOException;

public interface IAirportRepository {
	public String getInfo(String city) throws IOException;
}
