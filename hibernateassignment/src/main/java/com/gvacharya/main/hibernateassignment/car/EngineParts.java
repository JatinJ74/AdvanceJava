package com.gvacharya.main.hibernateassignment.car;

import java.util.List;

import javax.persistence.*;

@Entity
public class EngineParts {

	@Id
	@Column(name="part_id")
	private int partId;
	
	@Column(name="part_name")
	private String partName;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Brand> brand;

	public EngineParts(int partId, String partName, List<Brand> brand) {
		super();
		this.partId = partId;
		this.partName = partName;
		this.brand = brand;
	}

	public EngineParts() {
		super();

	}

	public int getPartId() {
		return partId;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public List<Brand> getBrand() {
		return brand;
	}

	public void setBrand(List<Brand> brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "EngineParts [partId=" + partId + ", partName=" + partName + ", brand=" + brand + "]";
	}
	
	


	
	
}
