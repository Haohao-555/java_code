package demo;

import java.util.ArrayList;
import java.util.List;

public class Provider {
    private String name;//Ê¡Ãû
    private List<City>cities=new ArrayList<City>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	public void addcity(City city){
		cities.add(city);
		
	}
    
}
