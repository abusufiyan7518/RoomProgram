package com.roomprogram;

public final class ImmutableString {
	private final String value;

	public ImmutableString(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;

	}

}