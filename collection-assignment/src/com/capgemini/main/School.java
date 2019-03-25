package com.capgemini.main;

import java.util.Objects;

public class School {
	private String name;
	private String city;
	private String district;
	private int ranking;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(String name, String city, String district, int ranking) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.ranking = ranking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", district=" + district + ", ranking=" + ranking + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,city,district);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof School))
			return false;
		if(this==obj)
			return true;
		School school = (School) obj;
		if(this.name.equals(school.name) && this.city.equals(school.city)&& this.district.equals(school.district))
			return true;
		else
			return false;
			
	}

}
