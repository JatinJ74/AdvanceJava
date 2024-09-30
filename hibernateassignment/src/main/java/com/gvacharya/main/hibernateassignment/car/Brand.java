package com.gvacharya.main.hibernateassignment.car;

import java.util.List;

import javax.persistence.*;

@Entity
public class Brand {

	@Id
	@Column(name="brand_id")
	private int brandId;
	
	@Column(name="brand_name")
	private String brandName;

	@ManyToMany(cascade=CascadeType.ALL,mappedBy="brand")
	private List<EngineParts> enginePart;

	public Brand() {
		super();
	}

	public Brand(int brandId, String brandName, List<EngineParts> enginePart) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.enginePart = enginePart;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<EngineParts> getEnginePart() {
		return enginePart;
	}

	public void setEnginePart(List<EngineParts> enginePart) {
		this.enginePart = enginePart;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", enginePart=" + enginePart + "]";
	}
	
 	
}
