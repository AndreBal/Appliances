package by.epamtc.balash.model;

import java.util.Map;

public class Laptop implements Device {

	private Double batteryCapacity;
	private String Os;
	private Double memoryRom;
	private Double SystemMemory;
	private Double Cpu;
	private Double DisplayInchs;

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", Os=" + Os + ", memoryRom=" + memoryRom
				+ ", SystemMemory=" + SystemMemory + ", Cpu=" + Cpu + ", DisplayInchs=" + DisplayInchs + "]";
	}

	public Double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOs() {
		return Os;
	}

	public void setOs(String os) {
		Os = os;
	}

	public Double getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(Double memoryRom) {
		this.memoryRom = memoryRom;
	}

	public Double getSystemMemory() {
		return SystemMemory;
	}

	public void setSystemMemory(Double systemMemory) {
		SystemMemory = systemMemory;
	}

	public Double getCpu() {
		return Cpu;
	}

	public void setCpu(Double cpu) {
		Cpu = cpu;
	}

	public Double getDisplayInchs() {
		return DisplayInchs;
	}

	public void setDisplayInchs(Double displayInchs) {
		DisplayInchs = displayInchs;
	}

	public Laptop(Map<String, String> params) {
		this.batteryCapacity = Double.parseDouble(params.get("BATTERY_CAPACITY"));
		this.Os = params.get("OS");
		this.memoryRom = Double.parseDouble(params.get("MEMORY_ROM"));
		this.SystemMemory = Double.parseDouble(params.get("SYSTEM_MEMORY"));
		this.Cpu = Double.parseDouble(params.get("CPU"));
		this.DisplayInchs = Double.parseDouble(params.get("DISPLAY_INCHS"));

	}

}
