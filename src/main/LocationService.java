package main;

import java.util.LinkedHashSet;
import java.util.Optional;

/**
 * 
 * The smallest unit of a location is ward, then sub-county, then county then
 * country. Feel free to rewrite, refactor and add as many methods as you wish,
 * but remember to keep it simple.
 */

public interface LocationService {

	/**
	 * Returns a set of locations from the smallest unit possible to the largest
	 * unit
	 */
	LinkedHashSet<Location> getLocationHierarchy(String id);

	/**
	 * Returns a comma separated name of a location from the smallest unit possible
	 * to the largest unit e.g Mikindani,Jomvu,Mombasa,Kenya
	 */

	String getLocationName(String id);

	/**
	 * Returns a <code>LocationDTO<code>
	 */
	Optional<LocationDTO> getLocationDTO(String id);

}
