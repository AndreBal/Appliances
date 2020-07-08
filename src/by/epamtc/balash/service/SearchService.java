package by.epamtc.balash.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import by.epamtc.balash.dao.DeviceDao;
import by.epamtc.balash.dao.TextDeviceDao;
import by.epamtc.balash.model.Device;

public class SearchService {

	public List<Device> find(String device, String parameter, String value) {
		List<Device> resultDevices = new ArrayList<Device>();

		DeviceDao deviceDao = new TextDeviceDao();
		List<Device> devices = deviceDao.getDevices();

		for (Device d : devices) {
			if (device.equals(d.getClass().getSimpleName())) {

				try {
					String targetValue = d.getClass().getMethod("get" + parameter).invoke(d).toString();
					if (value.equals(targetValue)) {
						resultDevices.add(d);
					}
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return resultDevices;
	}

}
