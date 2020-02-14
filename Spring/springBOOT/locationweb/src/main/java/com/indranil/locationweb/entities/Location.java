package com.indranil.locationweb.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "locationweb")
public class Location {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Pid")
	private int id;
	@Column(name = "Pcode")
	private String code;
	@Column(name = "Pname")
	private String name;
	@Column(name = "Ptype")
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + "]";
	}

}
