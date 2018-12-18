package com.magic;

public class VerifyMagicNumber {

	public VerifyMagicNumber() {
	}

	public boolean isCousin(int n) {

		for (int i = 2; i <= n; i++) {
			if (((n % i) == 0) && (i != n)) {
				return false;
			}
		}

		return n < 2 ? false : true;
	}

	public boolean hasExactSqrt(int n) {
		return (Math.sqrt(n) - Math.floor(Math.sqrt(n))) == 0 ? true : false;
	}

	public boolean isMagic(int n) {
		return hasExactSqrt(n) && isCousin((int) Math.sqrt(n));
	}

}
