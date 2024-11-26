package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Event_details")
@Data
public class Event {

	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	@Id
	@Column(name = "Event_name")
	String name;
	@Column(name = "Event_branch")
	String branch;
	@Column(name = "Event_date")
	String date;
	@Column(name = "Event_time",unique = true)
	String time;
	@Column(name = "Event_End_time")
	String endtime;
	@Column(name = "Event_venue")
	String venue;
	@Column(name = "Event_type")
	String type;
	@Column(name = "Event_points")
	int points;
	@Column(name = "Event_Count")
	int maxCount;
	
	public String getName() {
		return name;
	}
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
}
