package com.udemy.factory.clients;

import com.udemy.factory.processes.GeneralManufacturingProcess;
import com.udemy.factory.processes.LaptopManufacturingProcess;
import com.udemy.factory.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
	
	public static void main(String[] args) {
		GeneralManufacturingProcess laptopProcess = new LaptopManufacturingProcess("laptop");
		GeneralManufacturingProcess phoneProcess = new SmartphoneManufacturingProcess("phone");
		
		laptopProcess.launchProcess();
		phoneProcess.launchProcess();
	}
}
