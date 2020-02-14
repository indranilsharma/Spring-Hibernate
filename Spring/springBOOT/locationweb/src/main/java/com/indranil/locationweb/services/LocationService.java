package com.indranil.locationweb.services;

import java.util.List;

import com.indranil.locationweb.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	// make static
	static Location getLocationById(int id) {
		return null;
	}

	List<Location> getAllLocation();

}
