package com.magic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		VerifyMagicNumber verifyMagicNumber = new VerifyMagicNumber();

		Integer start, end, i = 1;
		List<Integer[]> intervals = new ArrayList<Integer[]>();

		
		//recebendo os intervalos
		System.out.println("Digite 0 para sair.");
		do {

			System.out.println("digite o primeiro número do intervalo " + i);
			start = Integer.parseInt(in.readLine());
			if (start <= 0)
				break;

			System.out.println("digite o segundo número do intervalo " + i);
			end = Integer.parseInt(in.readLine());
			if (end <= 0)
				break;

			intervals.add(new Integer[] { start, end });
			i++;
		} while (true);

		//calculando o número de números mágicos
		int magicNumbers = 0;
		for (Integer[] interval : intervals) {
			for (int k = interval[0]; k <= interval[1]; k++) {
				if (verifyMagicNumber.isMagic(k)) {
					magicNumbers++;
				}

			}
		}
		
		System.out.println("Result: " + magicNumbers);

	}
}
