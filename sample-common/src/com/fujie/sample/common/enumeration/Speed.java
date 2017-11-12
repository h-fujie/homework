package com.fujie.sample.common.enumeration;

public enum Speed {

	SLOW(0),
	FAST(1),
	FASTER(2),
	FASTEST(3);

	private int speed;

	private Speed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public static Speed valueOf(int speed) {
		for (Speed s : values()) {
			if (s.speed == speed) {
				return s;
			}
		}
		throw new IllegalArgumentException("unknown speed: " + speed);
	}

}
