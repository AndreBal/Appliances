package by.epamtc.balash.model;

import java.util.Map;

public class Oven implements Device {

	@Override
	public String toString() {
		return "Oven [powerConsumption=" + powerConsumption + ", weigth=" + weigth + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}

	private Double powerConsumption;
	private Double weigth;
	private Double capacity;
	private Double depth;
	private Double height;
	private Double width;

	public Oven(Map<String, String> params) {
		this.powerConsumption = Double.parseDouble(params.get("POWER_CONSUMPTION"));
		this.weigth = Double.parseDouble(params.get("POWER_CONSUMPTION"));
		this.capacity = Double.parseDouble(params.get("POWER_CONSUMPTION"));
		this.depth = Double.parseDouble(params.get("POWER_CONSUMPTION"));
		this.height = Double.parseDouble(params.get("POWER_CONSUMPTION"));
		this.width = Double.parseDouble(params.get("POWER_CONSUMPTION"));
	}

	public Double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(Double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public Double getWeigth() {
		return weigth;
	}

	public void setWeigth(Double weigth) {
		this.weigth = weigth;
	}

	public Double getCapacity() {
		return capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	public Double getDepth() {
		return depth;
	}

	public void setDepth(Double depth) {
		this.depth = depth;
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
