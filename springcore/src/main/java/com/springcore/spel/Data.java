package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;

public class Data {
	@Value("#{10+20}")
	private int x;
	@Value("#{50-20}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int z;
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Data [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
