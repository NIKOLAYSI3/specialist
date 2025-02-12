package ru.specialist.textfile;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		// Лабораторная работа № 9.1
		
		// должно быть 116 строк, 4 140 с пробелами и 601 слово
		
		Path labs = Paths.get("..", "labs.txt");
		if(Files.exists(labs))
			System.out.println(Files.readString(labs, Charset.forName("utf-8")));
		
		
		int maxLines = 0;
		int symbol = 0;
		int words = 0;
		String linePattern = "\s.";
		var lines = Files.readAllLines(labs,Charset.forName("utf-8"));
		for(int i = 0; i <= lines.size(); i++) {
			maxLines++;
		}
		for(var o : lines) {
			symbol += o.length();
			words += o.split(linePattern).length;
		}
		System.out.println(maxLines); // вывод кол-ва строк
		System.out.println(symbol); // вывод кол-ва символов
		System.out.println(words); // вывод кол-ва слов
		
		
	
		
	}

}
