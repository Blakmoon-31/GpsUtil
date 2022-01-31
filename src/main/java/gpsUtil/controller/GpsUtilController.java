package gpsUtil.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

@RestController
public class GpsUtilController {

	private GpsUtil gpsUtil = new GpsUtil();

	@GetMapping("/getAttractions")
	public List<Attraction> getAllAttractions() {
		return gpsUtil.getAttractions();
	}

	@GetMapping("/getUserLocation/{id}")
	public VisitedLocation getUserLocation(@PathVariable("id") UUID userID) {
		return gpsUtil.getUserLocation(userID);
	}
}
