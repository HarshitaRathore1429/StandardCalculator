package com.yash.calculator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="memory")
@Table(name="memory")
public class Memory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String saved;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSaved() {
		return saved;
	}
	public void setSaved(String saved) {
		this.saved = saved;
	}
	public Memory(int id, String saved) {
		super();
		this.id = id;
		this.saved = saved;
	}
	public Memory() {
		super();
		// TODO Auto-generated constructor stub
	}
}
