package com.interview.enumtest;

interface Features {
	public float getUpcharge();
	public String getDescription();
}

enum GuitarFeatures implements Features {

	ROSEWOOD(0), MAHOGANY(0), ZIRICOTE(300), SPRUCE(0), CEDAR(0), AB_ROSETTE(75), AB_TOP_BORDER(400), IL_DIAMONDS(
			150), IL_DOTS(0);

	private float upcharge;

	GuitarFeatures(float upcharge) {
		this.upcharge = upcharge;
	}

	public float getUpcharge() {
		return upcharge;
	}

	public String getDescription() {
		switch (this) {
		case ROSEWOOD:
			return "Rosewood back and sides"; 
		case MAHOGANY:
			return "Mahogany back and sides";
		case ZIRICOTE:
			return "Ziricote back and sides";
		case SPRUCE:
			return "Sitka Spruce top";
		case CEDAR:
			return "Wester Red Cedar top";
		case AB_ROSETTE:
			return "Abalone rosette";
		case AB_TOP_BORDER:
			return "Abalone top border";
		case IL_DIAMONDS:
			return "Diamonds and squares fretboard inlay";
		case IL_DOTS:
			return "Small dots fretboard inlay";
		default:
			return "Unknown feature";
		}
	}
}

public class EnumTest2 {
	public static void main(String[] args) {
		System.out.println("Price: " + GuitarFeatures.ZIRICOTE.getUpcharge() + "\nDesc:"
				+ GuitarFeatures.ZIRICOTE.getDescription() + "\n----------------");
		for (GuitarFeatures features : GuitarFeatures.values()) {
			System.out.println(
					"Price: " + features.getUpcharge() + "\nDesc:" + features.getDescription() + "\n----------------");
		}
	}
}