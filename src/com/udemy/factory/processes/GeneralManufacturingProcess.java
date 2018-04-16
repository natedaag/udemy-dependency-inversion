package com.udemy.factory.processes;

public abstract class GeneralManufacturingProcess {
	
	private String processName;
	
	public GeneralManufacturingProcess(String name) {
		processName = name;
	}
	
	protected abstract void assembleDevice();
	protected abstract void testDevice();
	protected abstract void packageDevice();
	protected abstract void storeDevice();
	
	// template method - commonly used in abstracting workflows, common across many types of objects
	public void launchProcess() {
		if(processName != null && !processName.isEmpty()) {
		assembleDevice();
		testDevice();
		packageDevice();
		storeDevice();
		} else {
			System.out.println("Specify process please");
		}
	}
}
