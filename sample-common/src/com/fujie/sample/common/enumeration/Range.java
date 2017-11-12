package com.fujie.sample.common.enumeration;

public enum Range {

	SHORT(0),
	MIDDLE(1),
	LONG(2),
	ULTRA_LONG(3);

	private int range;

	private Range(int range) {
		this.range = range;
	}

	public int getRange() {
		return range;
	}

	public static Range valueOf(int range) {
		for (Range r : values()) {
			if (r.range == range) {
				return r;
			}
		}
		throw new IllegalArgumentException("unknown range: " + range);
	}

}
