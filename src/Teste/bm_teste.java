package Teste;

import java.io.IOException;

import Files.BoyerMoore;

public class bm_teste {

	public static void main(String[] args) throws IOException {

		System.out.print("Boyer Moore Algorithm Test\n");
		String text = "ABCDJKEFGHIJKLMNOPQRSTUVWXYZ";
		String pattern = "JKLM";

		BoyerMoore bm = new BoyerMoore();

		int offset = bm.findPatternn(text, pattern);
		System.out.print("pattern: ");
		for (int i = 0; i < offset; i++)
			System.out.print(" ");
		System.out.println(pattern);
		System.out.println("text:    " + text);

	}

}
