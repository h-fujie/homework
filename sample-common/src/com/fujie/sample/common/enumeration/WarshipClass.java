package com.fujie.sample.common.enumeration;

public enum WarshipClass {

	DESTROYER(0),
	LIGHT_CRUISER(1),
	HEAVY_CRUISER(2),
	BATTLESHIP(3),
	LIGHT_AIRCRACT_CARRIER(4),
	AIRCRACT_CARRIER(5),
	SEAPLANE_CARRIER(6),
	AVITATION_BATTLESHIP(7),
	SUBMARINE(8);

	private int warshipClass;

	private WarshipClass(int warshipClass) {
		this.warshipClass = warshipClass;
	}

	public int getWarshipClass() {
		return warshipClass;
	}

	public static WarshipClass valueOf(int warshipClass) {
		for (WarshipClass wc : values()) {
			if (wc.warshipClass == warshipClass) {
				return wc;
			}
		}
		throw new IllegalArgumentException("unknown class: " + warshipClass);
	}

}
