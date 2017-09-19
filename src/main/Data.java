package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Data {
	private MultiValueMap<String, String> counties;
    private MultiValueMap <String,String>subcountyid;
	public MultiValueMap<String, String> getSubcountyid() {
		return subcountyid;
	}

	public MultiValueMap<String, String> getCounties() {
		return counties;
	}
	
	private MultiValueMap<String, String> subcounties;
	private MultiValueMap<String, String> ward;
	public MultiValueMap<String, String> getSubcounties() {
		return subcounties;
	}
	public void setSubcounties(MultiValueMap<String, String> d) {
		this.subcounties = d;
	}
	public MultiValueMap<String,String> getWard() {
		return ward;
	}
	public void setWard(MultiValueMap<String, String> e) {
		this.ward = e;
	}
	public void setCounties(MultiValueMap counties) {
		// TODO Auto-generated method stub
		this.counties = counties;
	}
	public void setSubcountyid(MultiValueMap subcountyid) {
		// TODO Auto-generated method stub
		this.subcountyid = subcountyid;

	}
	
 

	

}
