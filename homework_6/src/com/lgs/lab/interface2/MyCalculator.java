package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	@Override
	public void Devide1() {

		int a = 12;
		int b = 4;

		int c = a / b;
		System.out.println(c);

	}

	@Override
	public void Minus1() {
		int a = 12;
		int b = 4;

		int c = a - b;
		System.out.println(c);

	}

	@Override
	public void Multiply1() {
		int a = 12;
		int b = 4;

		int c = a * b;
		System.out.println(c);

	}

	@Override
	public void Plus1() {
		int a = 12;
		int b = 4;

		int c = a + b;
		System.out.println(c);

	}

}
