package com.onsite.base_page;

public class DiamensionClass {
	private int width;
	private int height;
	
	public DiamensionClass(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int[] getSize() {
		return new int[]  {width, height};
	}
	
	public void setSize(int width, int height) {
		this.width=10;
		this.height=20;
	}
	
	public int area() {
		return width * height;
	}
	
	public String toString() {
		return height + ": height, " + width + ": width";
	}
}
