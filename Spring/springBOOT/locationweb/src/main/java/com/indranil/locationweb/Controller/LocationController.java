package com.indranil.locationweb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.indranil.locationweb.entities.Location;
import com.indranil.locationweb.repos.LocationRepository;
import com.indranil.locationweb.services.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService locationService;

	@Autowired
	LocationRepository LocationRepository;

	@RequestMapping("/show")
	public String show() {
		return "createLocation";
	}

	// save as object and ModelAttribute responsible for request handling,model map
	// responsible for response handling and that back to jsp
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSave = locationService.saveLocation(location);
		String message = " Location got saved :" + locationSave.getId();
		modelMap.addAttribute("message", message);
		return "createLocation";
	}

	@RequestMapping("/display")
	public String displayLocation(ModelMap modelMap) {
		List<Location> allLocation1 = locationService.getAllLocation();
		modelMap.addAttribute("allLocation1", allLocation1);
		return "displayLocation";
	}

	// @RequestParam extracting id
	@RequestMapping("/deleteLoc")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = new Location();
		location.setId(id);
		locationService.deleteLocation(location);
		List<Location> allLocation1 = locationService.getAllLocation();
		modelMap.addAttribute("allLocation", allLocation1);
		return "displayLocation";
	}

	@RequestMapping("/displayUpdateLocation")
	public String displayUpdateLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Location allLocation1 = LocationService.getLocationById(id);

		modelMap.addAttribute("allLocation1", allLocation1);
		return "updateLocation";
	}

	// modelAttribute taking whole object and update on the basis of total object.
	// by the help of modelmap we are retriving modelobject

	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("allLocation") Location allLocation, ModelMap modelMap) {
		locationService.updateLocation(allLocation);

		List<Location> allLocation1 = locationService.getAllLocation();

		modelMap.addAttribute("allLocation1", allLocation1);
		return "displayLocation";
	}

}
