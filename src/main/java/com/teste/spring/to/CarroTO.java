package com.teste.spring.to;

public class CarroTO {
	
	private String marca;
	private String modelo;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "CarroTO [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	

}
