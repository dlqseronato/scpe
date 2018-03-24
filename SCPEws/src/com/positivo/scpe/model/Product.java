package com.positivo.scpe.model;

public class Product {
	private int id;
	private String description;
	private String unityType;
	private double unitySellValue;
	private double unityBuyValue;
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
	public String getUnityType() {
		return unityType;
	}
	public void setUnityType(String unityType) {
		this.unityType = unityType;
	}
	public double getUnitySellValue() {
		return unitySellValue;
	}
	public void setUnitySellValue(double unitySellValue) {
		this.unitySellValue = unitySellValue;
	}
	public double getUnityBuyValue() {
		return unityBuyValue;
	}
	public void setUnityBuyValue(double unityBuyValue) {
		this.unityBuyValue = unityBuyValue;
	}
	
}
