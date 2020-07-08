package by.epamtc.balash.main;

import java.util.List;

import by.epamtc.balash.model.Device;
import by.epamtc.balash.service.SearchService;

public class Main {

	public static void main(String[] args) {
		SearchService searchService = new SearchService();
		List<Device> searchResult = searchService.find("Refrigerator","Weight","20.0");
		for(Device d : searchResult) {
		System.out.println(d);
		}
	}

}
