package com.ssi.l2c;

import java.util.Random;

import static java.lang.Math.abs;

public class Hello {
	
	public static void main(String[] args) {
		Random rand=new Random();
		byte val1= (byte) rand.nextInt(Byte.MAX_VALUE);
		short val2= (short) rand.nextInt(Short.MAX_VALUE);
		int val3= rand.nextInt(Integer.MAX_VALUE);
		long total=50000+10*(val1+val2+val3);

		System.out.println("Total: "+total);
	}

}
