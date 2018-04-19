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
	
	/* 
	 * template method follows - commonly used in abstracting workflows
	 * where we want to dictate the order of operations(assemble, etc.)
	 * across different objects
	 */
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
