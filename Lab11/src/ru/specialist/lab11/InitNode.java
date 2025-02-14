package ru.specialist.lab11;

public class InitNode {
	
	public int val;
	
	public InitNode next;
	
	public InitNode(int val) {
		this(val,null);
	}
	
	public InitNode(int val, InitNode next) {
		this.val = val;
		this.next = next;
	}
	

}
