package com.stream.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.modal.test.modal;

@FunctionalInterface
interface printMap {
	HashMap<String, Float> printM(modal a);
}

public class StreamTest {
	public static void main(String args[]) {
		List<modal> modalList = new ArrayList<modal>();
		modalList.add(new modal("Any", 200000f, 2));
		modalList.add(new modal("Bunty", 300000f, 4));
		modalList.add(new modal("Chery", 400000f, 6));
		modalList.add(new modal("Deni", 500000f, 7));
		modalList.add(new modal("Elf", 600000f, 9));
		modalList.add(new modal("Fisher", 700000f, 12));
		modalList.add(new modal("Gour", 800000f, 34));
		modalList.stream().filter(modalListElement -> modalListElement.getNumber() % 2 == 0).forEach(modalElement -> {
			printMap p = (w) -> {
				HashMap<String, Float> map = new HashMap<String, Float>();
				map.put(w.getName(), w.getSalary());
				return map;
			};
			getSalaryValue(p.printM(modalElement));

		});

	}

	private static void getSalaryValue(HashMap<String, Float> map) {
		map.keySet().forEach(e -> System.out.println(e+" : "+map.get(e)));
		map.keySet().forEach(System.out::println);//to print keys
		map.values().forEach(System.out::println);//print values
		System.out.println(map); //print map
		System.out.println("----------------------------------");

	}
}
