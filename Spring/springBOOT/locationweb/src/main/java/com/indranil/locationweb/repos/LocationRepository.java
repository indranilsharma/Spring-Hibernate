package com.indranil.locationweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indranil.locationweb.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
