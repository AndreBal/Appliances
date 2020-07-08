package by.epamtc.balash.model;

import java.util.Map;

public class TabletPC implements Device {
	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", blue=" + blue + "]";
	}

	private Double batteryCapacity;
	private Double displayInches;
	private Double memoryRom;
	private Double flashMemoryCapacity;
	private String blue;

	public TabletPC(Map<String, String> params) {
		this.batteryCapacity = Double.parseDouble(params.get("BATTERY_CAPACITY"));
		this.displayInches = Double.parseDouble(params.get("DISPLAY_INCHES"));
		this.memoryRom = Double.parseDouble(params.get("MEMORY_ROM"));
		this.flashMemoryCapacity = Double.parseDouble(params.get("FLASH_MEMORY_CAPACITY"));
		this.blue = params.get("COLOR");
	}

	public Double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public Double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(Double displayInches) {
		this.displayInches = displayInches;
	}

	public Double getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(Double memoryRom) {
		this.memoryRom = memoryRom;
	}

	public Double getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(Double flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getBlue() {
		return blue;
	}

	public void setBlue(String blue) {
		this.blue = blue;
	}

}
