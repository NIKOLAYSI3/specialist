package ru.cpecialist.stringlab;

public class StringLab {

	public static StringBuilder convetr(int x) {
		StringBuilder str = new StringBuilder();
		while(x > 0) {
			str.insert(0, x % 2);
			x /= 2;
		}
		if(str.length() < 32) {
			for(int i = str.length(); i < 32; i++)
				str.insert(0, 0);
		}
			
		return str;
	}
	
	public static StringBuilder convetr(byte x) {
		StringBuilder str = new StringBuilder();
		while(x > 0) {
			str.insert(0, x % 2);
			x /= 2;
		}
		if(str.length() < 8) {
			for(int i = str.length(); i < 8; i++)
				str.insert(0, 0);
		}
			
		return str;
	}
	
	public static StringBuilder convetr(short x) {
		StringBuilder str = new StringBuilder();
		while(x > 0) {
			str.insert(0, x % 2);
			x /= 2;
		}
		if(str.length() < 16) {
			for(int i = str.length(); i < 16; i++)
				str.insert(0, 0);
		}
			
		return str;
	}
	
	public static StringBuilder convetr(long x) {
		StringBuilder str = new StringBuilder();
		while(x > 0) {
			str.insert(0, x % 2);
			x /= 2;
		}
		if(str.length() < 64) {
			for(int i = str.length(); i < 64; i++)
				str.insert(0, 0);
		}
			
		return str;
	}
	
	public static void main(String[] args) {
		// Лабораторная работа № 8.1
		int i = 350;
		byte b = 7;
		short s = 11;
		long l = 42314;
		
		System.out.println(convetr(b));
		System.out.println(convetr(s));
		System.out.println(convetr(i));
		System.out.println(convetr(l));
		
	}

}
