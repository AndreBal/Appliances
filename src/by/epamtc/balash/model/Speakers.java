package by.epamtc.balash.model;

import java.util.Map;

public class Speakers implements Device {
	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}

	private Double powerConsumption;
	private Double numberOfSpeakers;
	private String frequencyRange;
	private Double cordLength;

	public Speakers(Map<String, String> params) {
		this.powerConsumption = Double.parseDouble(params.get("POWER_CONSUMPTION"));
		this.numberOfSpeakers = Double.parseDouble(params.get("NUMBER_OF_SPEAKERS"));
		this.frequencyRange = params.get("FREQUENCY_RANGE");
		this.cordLength = Double.parseDouble(params.get("CORD_LENGTH"));
	}

	public Double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(Double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public Double getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(Double numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public Double getCordLength() {
		return cordLength;
	}

	public void setCordLength(Double cordLength) {
		this.cordLength = cordLength;
	}

}
