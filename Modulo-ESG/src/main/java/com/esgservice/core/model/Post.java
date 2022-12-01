package com.esgservice.core.model;

import java.util.Date;

public class Post {
	private int id;
	private String description;
	private String urLImg;
	private Date fecha;
	private String titulo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrLImg() {
		return urLImg;
	}
	public void setUrLImg(String urLImg) {
		this.urLImg = urLImg;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Post(int id, String description, String urLImg, Date fecha, String titulo) {
		this.id = id;
		this.description = description;
		this.urLImg = urLImg;
		this.fecha = fecha;
		this.titulo = titulo;
	}
	public Post() {
	}
	
}
