package by.epamtc.balash.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.epamtc.balash.model.Device;
import by.epamtc.balash.model.Laptop;
import by.epamtc.balash.model.Oven;
import by.epamtc.balash.model.Refrigerator;
import by.epamtc.balash.model.Speakers;
import by.epamtc.balash.model.TabletPC;
import by.epamtc.balash.model.VacuumCleaner;

public class TextDeviceDao implements DeviceDao {

	private final static String pathToDevices = ".\\data\\appliances_db.txt";
	private static List<Device> devices;

	@Override
	public List<Device> getDevices() {
		if (devices == null) {
			parseDevices();
		}

		return devices;
	}

	private void parseDevices() {
		devices = new ArrayList<Device>();
		Path pathToFile = Paths.get(pathToDevices);
		try (BufferedReader reader = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {
			String line;
			while ((line = reader.readLine()) != null) {
				line.trim();
				if(line.equals("")) {
					continue;
				}
				String[] deviceArgs = line.split(":");
				Device device = createDevice(deviceArgs);
				devices.add(device);
			}

		} catch (IOException e) {
			System.err.println("Cannot read file appliances_db");
			e.printStackTrace();
		}
	}

	private Device createDevice(String[] deviceArgs) {
		Device device = null;
		String deviceName = deviceArgs[0].trim();
		String[] characteristicsArray = deviceArgs[1].split(",");
		Map<String, String> deviceCharacteristics = new HashMap<String, String>();
		for (String s : characteristicsArray) {
			String[] characteristicAndValue = s.split("=");
			deviceCharacteristics.put(characteristicAndValue[0].trim(), characteristicAndValue[1].trim());
		}
		switch (deviceName) {
		case "Laptop":
			device = new Laptop(deviceCharacteristics);
			break;
		case "Oven":
			device = new Oven(deviceCharacteristics);
			break;
		case "Refrigerator":
			device = new Refrigerator(deviceCharacteristics);
			break;
		case "Speakers":
			device = new Speakers(deviceCharacteristics);
			break;
		case "TabletPC":
			device = new TabletPC(deviceCharacteristics);
			break;
		case "VacuumCleaner":
			device = new VacuumCleaner(deviceCharacteristics);
			break;
		}

		return device;
	}

}
