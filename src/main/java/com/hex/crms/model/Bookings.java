package com.hex.crms.model;

//CHECKSTYLE:OFF 
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hex.crms.dao.RoomsDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "bookings")
@Component
public class Bookings {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String transactionId ;
	private Integer RoomId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
	private Date startDateTs ; 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
	private Date endDateTs ; 
	private int userId ;
	private Boolean isCancelled; 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
	private Date creationTs ;
	private String createdBy ;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
	private Date modifiedTs ; 
	private String modifiedBy ;
	private Boolean StatusType; 
	@Transient
private String roomName;
@Transient
private String roomLocation;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getRoomId() {
		return this.RoomId;
	}

	public void setRoomId(Integer RoomId) {
		this.RoomId = RoomId;
	}

	public Date getStartDateTs() {
		return this.startDateTs;
	}

	public void setStartDateTs(Date startDateTs) {
		this.startDateTs = startDateTs;
	}

	public Date getEndDateTs() {
		return this.endDateTs;
	}

	public void setEndDateTs(Date endDateTs) {
		this.endDateTs = endDateTs;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Boolean isIsCancelled() {
		return this.isCancelled;
	}

	public Boolean getIsCancelled() {
		return this.isCancelled;
	}

	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
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

	public Boolean isStatusType() {
		return this.StatusType;
	}

	public Boolean getStatusType() {
		return this.StatusType;
	}

	public void setStatusType(Boolean StatusType) {
		this.StatusType = StatusType;
	}

	public String getRoomName() {

		return this.roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomLocation() {
		return this.roomLocation;
	}

	public void setRoomLocation(String roomLocation) {
		this.roomLocation = roomLocation;
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", transactionId='" + getTransactionId() + "'" +
			", RoomId='" + getRoomId() + "'" +
			", startDateTs='" + getStartDateTs() + "'" +
			", endDateTs='" + getEndDateTs() + "'" +
			", userId='" + getUserId() + "'" +
			", IsCancelled='" + getIsCancelled() + "'" +
			", creationTs='" + getCreationTs() + "'" +
			", createdBy='" + getCreatedBy() + "'" +
			", modifiedTs='" + getModifiedTs() + "'" +
			", modifiedBy='" + getModifiedBy() + "'" +
			", StatusType='" + getStatusType() + "'" +
			", roomName='" + getRoomName() + "'" +
			", roomLocation='" + getRoomLocation() + "'" +
			"}";
	}






	public Bookings() {

	}



}