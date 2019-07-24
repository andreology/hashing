//Andre Barajas 

import java.util.LinkedList;

public class HashTable {
	private LinkedList<Long>[] table;
	private int tableSize;

	public HashTable() {
	}

	public HashTable(int x) {
		setTableSize(x);
		table = new LinkedList[x];
		for (int i = 0; i <= x - 1; i++) {
			table[i] = new LinkedList<Long>();
			table[i].add((long) 0);
		}

	}

	public void insertWord(long x) {
		int m = tableSize;
		int index = (int) x % m;
		index = Math.abs(index);
		long size = table[index].get(0);
		size++;
		table[index].add(0, size);
		table[index].add(x);

	}

	public void statistics() {
		int counter = 0;
		int sum = 0;
		int total = 0;
		int max = 0;
		// Steps through the array list.
		for (int i = 0; i < tableSize; i++) {
			// Steps through the linked list.
			int listSize = table[i].size() - 1;

			if (listSize > 0) {

				sum = sum + listSize;
				// Find the max.
				if (listSize > max) {
					max = listSize;
				}

			} else if (listSize == 0) {
				counter++;
			}
		}
		total = sum / (tableSize - counter);

		System.out.println("Empty cells: " + counter);
		System.out.println("Total: " + total);
		System.out.println("Max:" + max);
		System.out.println();
	}

	public int getTableSize() {
		return tableSize;
	}

	public void setTableSize(int tableSize) {
		this.tableSize = tableSize;
	}

	public LinkedList<Long>[] getTable() {
		return table;
	}

	public void setTable(LinkedList<Long>[] table) {
		this.table = table;
	}

}