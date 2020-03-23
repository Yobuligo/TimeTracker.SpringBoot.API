package com.yobuligo.TimeTracker.SpringBoot.API.Subject;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String description;
	private Date createdAt = new Date();
	private Date changedAt = new Date();
	private Location location;
	private Boolean locationable = true;
	private Boolean supportsVariableTimeTracking = true;
	private String colorCode;

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getChangedAt() {
		return changedAt;
	}

	public void setChangedAt(Date changedAt) {
		this.changedAt = changedAt;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Boolean getLocationable() {
		return locationable;
	}

	public void setLocationable(Boolean locationable) {
		this.locationable = locationable;
	}

	public Boolean getSupportsVariableTimeTracking() {
		return supportsVariableTimeTracking;
	}

	public void setSupportsVariableTimeTracking(Boolean supportsVariableTimeTracking) {
		this.supportsVariableTimeTracking = supportsVariableTimeTracking;
	}

}
