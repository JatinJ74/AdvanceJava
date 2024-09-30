package com.gvacharya.main.hibernateassignment.car;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Engine {

	@Id
	@Column(name="engine_id")
	private int engineId;
	
	@Column(name="engine_type")
	private String engineType;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<EngineParts> engineParts;

	public Engine(int engineId, String engineType, List<EngineParts> engineParts) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
		this.engineParts = engineParts;
	}

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEngineId() {
		return engineId;
	}

	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public List<EngineParts> getEngineParts() {
		return engineParts;
	}

	public void setEngineParts(List<EngineParts> engineParts) {
		this.engineParts = engineParts;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineType=" + engineType + ", engineParts=" + engineParts + "]";
	}
	
	
}
