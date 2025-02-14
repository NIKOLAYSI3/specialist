package ru.specialist.lab11;

public class InitList {
	
	public InitNode first = null;
	public int size = 0;
	public boolean contains = false;
	public int id = 0;
	public int indexOfList = 0;
	
	public InitList add(int val) {
		InitNode Node1 = new InitNode(val);
		if(size == 0)
			first = Node1;
		else {
			var last = first;
			while(last != null && last.next != null)
				last = last.next;
			
			if(last != null)
				last.next = Node1;
		}
		size++;
		return this;
	}
	
	public boolean remove(int value) {
		if(first != null && first.val == value) {
			first = first.next;
			size--;
			return true;
		}
			
		var prev = first;
		while(prev != null && prev.next.val != value)
			prev = prev.next;
		
		if(prev != null) {
			prev.next = prev.next.next;
			size--;
			return true;
		}
		return false;
	}
	
	
	// истина, если значение есть, если ложь, то false
	public boolean contais(int value) {
		
		var cont = first;
		
		
		while(cont != null) {
		if(cont.val == value) {
			return contains = true;
		} 
		cont = cont.next;
		}
		
		return contains;
	}
	
	// ищет значение и возвращает индекс элемента с указаным значением
	public int indexOf(int value) {
		
		var index = first;
		
		while(index != null) {
			if(index.val == value)
		return id;
		id++;
		index = index.next;
		}
		return 0;
	}
	
	// по порядковому номеру ищет значение
	public int get(int index) {
		
		var firstIndex = first;
		
		
		while(firstIndex != null && index != 0) {
			firstIndex = firstIndex.next;
			index--;
		}
		return indexOfList = firstIndex.val;
	}
	
	
	public void print() {
		System.out.printf("List size: %d\nValue: ", size);
		var next = first;
		while(next != null) {
			System.out.printf("%-4d", next.val);
			next = next.next;
		}
		System.out.println();
		System.out.printf("Contains: %b\n", contains);
		System.out.printf("Index: %d\n", id);
		System.out.printf("Value of index: %d\n", indexOfList);
		System.out.println();
	}
	

}
