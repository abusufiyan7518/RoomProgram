package com.munnabhaiya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Sufiyan");
		al.add("ufiyan");
		al.add("Sfiyan");
		al.add("Suiyan");
		al.add("Sufyan");
		al.add("Sufian");
		al.add("Sufiyn");
		al.add("Sufiya");
		al.add("ufiyan");
		al.add("fiyan");
		al.add("iyan");
		al.add("yan");
		al.add("an");
		al.add("n");
		al.add("");
		al.add("n");
		al.add("an");
		al.add("yan");
		al.add("iyan");
		al.add("fiyan");
		al.add("ufiyan");
		al.add("Sufiyan");
		al.add("Sufiya");
		al.add("Sufiy");
		al.add("Sufi");
		al.add("Suf");
		al.add("Su");
		al.add("S");
		al.add("Sufiya");
		al.add("Sufiyn");
		al.add("Sufian");
		al.add("Sufyan");
		al.add("Suiyan");
		al.add("Sfiyan");
		al.add("ufiyan");
		al.add("fiyan");
		al.add("Suyan");
		al.add("Sufin");
		al.add("Sufiya");
		al.add("Sufiy");
		al.add("Sufan");
		al.add("Siyan");
		al.add("ufiyan");
		al.add("Sufiyan");
		System.out.println(al.size());
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}