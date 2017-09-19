package main;

import java.util.Map;

/**
 * 
 * Feel free to rewrite, refactor and add as many methods as you wish, but
 * remember to keep it simple.
 *
 */
public class LocationDTO extends Location {

	/**
	 * Returns a comma separated name of a location from the smallest unit possible
	 * to the largest unit e.g Mikindani,Jomvu,Mombasa,Kenya
	 */
	private String fullName;

	/**
	 * Returns a Map of parent locations of the current location. The key is the
	 * parent location type and the value is the parent location name
	 */
	private Map<String, String> parentLocations;

}