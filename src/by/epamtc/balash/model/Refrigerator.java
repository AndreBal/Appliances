package by.epamtc.balash.model;

import java.util.Map;

public class Refrigerator implements Device {

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}

	private Double powerConsumption;
	private Double weight;
	private Double freezerCapacity;
	private Double overallCapacity;
	private Double height;
	private Double width;

	public Refrigerator(Map<String, String> params) {
		this.powerConsumption = Double.parseDouble(params.get("POWER_CONSUMPTION"));
		this.weight = Double.parseDouble(params.get("WEIGHT"));
		this.freezerCapacity = Double.parseDouble(params.get("FREEZER_CAPACITY"));
		this.overallCapacity = Double.parseDouble(params.get("OVERALL_CAPACITY"));
		this.height = Double.parseDouble(params.get("HEIGHT"));
		this.width = Double.parseDouble(params.get("WIDTH"));

	}

	public Double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(Double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(Double freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public Double getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(Double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

}
