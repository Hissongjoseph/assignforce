package com.revature.assignforce.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Room")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Room_ID")
	@SequenceGenerator(name = "Room_ID", sequenceName = "Room_ID_seq", allocationSize = 1)
	@Column(name = "Room_ID")
	private int id;

	@Column(name = "Room_Name")
	@NotNull(message = "name must not be null")
	@Size(min = 1, max = 128, message = "RoomName size must be between 1 and 128")
	private String name;

//	@JsonIgnoreProperties
//	@ManyToOne(targetEntity=Building.class,fetch=FetchType.LAZY)
//	@JoinColumn(name = "BUILDING_ID")
//	private Building buildingObject;

	@Column(name="BUILDING_ID")
	private Integer building;


	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(int id, String name, Integer building) {
		super();
		this.id = id;
		this.name = name;
		//this.buildingObject = notbuilding;
		this.building = building;
	}


//	public Room(int i, String string) {
//		// TODO Auto-generated constructor stub
//	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



//	public void setNotbuilding(Building notbuilding) {
//		this.buildingObject = notbuilding;
//	}


	public Integer getBuilding() {
		return building;
	}

	public void setBuilding(Integer building) {
		this.building = building;
	}
}
