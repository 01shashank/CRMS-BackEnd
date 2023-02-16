package com.hex.crms.model;

//CHECKSTYLE:OFF 
import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "roomtypes")
@Component
public class RoomTypes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String RoomTypeName;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date creationTs;
	private String CreatedBy;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date ModifiedTs;
	private String ModifiedBy;
	private Boolean StatusType;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoomTypeName() {
		return this.RoomTypeName;
	}

	public void setRoomTypeName(String RoomTypeName) {
		this.RoomTypeName = RoomTypeName;
	}

	public Date getCreationTs() {
		return this.creationTs;
	}

	public void setCreationTs(Date creationTs) {
		this.creationTs = creationTs;
	}

	public String getCreatedBy() {
		return this.CreatedBy;
	}

	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}

	public Date getModifiedTs() {
		return this.ModifiedTs;
	}

	public void setModifiedTs(Date ModifiedTs) {
		this.ModifiedTs = ModifiedTs;
	}

	public String getModifiedBy() {
		return this.ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		this.ModifiedBy = ModifiedBy;
	}

	public Boolean getStatusType() {
		return this.StatusType;
	}

	public void setStatusType(Boolean StatusType) {
		this.StatusType = StatusType;
	}

}
