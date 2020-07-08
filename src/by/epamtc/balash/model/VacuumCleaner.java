package by.epamtc.balash.model;

import java.util.Map;

public class VacuumCleaner implements Device {
	@Override
	public String toString() {
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}

	private Double powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private Double motorSpeedRegulation;
	private Double cleaningWidth;

	public VacuumCleaner(Map<String, String> params) {
		this.powerConsumption = Double.parseDouble(params.get("POWER_CONSUMPTION"));
		this.filterType = params.get("FILTER_TYPE");
		this.bagType = params.get("BAG_TYPE");
		this.wandType = params.get("WAND_TYPE");
		this.motorSpeedRegulation = Double.parseDouble(params.get("MOTOR_SPEED_REGULATION"));
		this.cleaningWidth = Double.parseDouble(params.get("CLEANING_WIDTH"));
	}

	public Double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(Double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public Double getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(Double motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public Double getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(Double cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

}
