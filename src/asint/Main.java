package asint;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import alex.AnalizadorLexico;
import java_cup.parser;

public class Main {

	public static void main(String[] args) throws Exception {
	     Reader input = new InputStreamReader(new FileInputStream("input4.txt"));
		 AnalizadorLexico alex = new AnalizadorLexico(input);
		 AnalizadorSintactico asint = new AnalizadorSintactico(alex);
		 //asint.setScanner(alex);
		 asint.parse();
	 }

}
