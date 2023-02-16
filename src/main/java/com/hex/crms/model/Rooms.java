package com.hex.crms.model;

import com.fasterxml.jackson.annotation.JsonFormat;

//CHECKSTYLE:OFF 
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "confrenecerooms")
@Component
public class Rooms {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	
private String name;
private String location;  
private Integer capacity; 
private Boolean isActive; 
private Integer roomTypeId;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
private Date creationTs;
private String createdBy; 
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
private Date modifiedTs;
private String modifiedBy;  
private Boolean statusType;

public Rooms(){

}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getRoomTypeId() {
		return this.roomTypeId;
	}

	public void setRoomTypeId(Integer roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public Date getCreationTs() {
		return this.creationTs;
	}

	public void setCreationTs(Date creationTs) {
		this.creationTs = creationTs;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedTs() {
		return this.modifiedTs;
	}

	public void setModifiedTs(Date modifiedTs) {
		this.modifiedTs = modifiedTs;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Boolean getStatusType() {
		return this.statusType;
	}

	public void setStatusType(Boolean statusType) {
		this.statusType = statusType;
	}
	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", location='" + getLocation() + "'" +
			", capacity='" + getCapacity() + "'" +
			", isActive='" + getIsActive() + "'" +
			", roomTypeId='" + getRoomTypeId() + "'" +
			", creationTs='" + getCreationTs() + "'" +
			", createdBy='" + getCreatedBy() + "'" +
			", modifiedTs='" + getModifiedTs() + "'" +
			", modifiedBy='" + getModifiedBy() + "'" +
			", statusType='" + getStatusType() + "'" +
			"}";
	}
}
