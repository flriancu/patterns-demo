package oo.behavioral.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyPlay {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 3, 2, 4, 1, 6);

		System.out.println("list (before): " + list);
		Comparator<Integer> compareAlgorithm = new AscendingComparator();
		Collections.sort(list, compareAlgorithm);
		System.out.println("list (after): " + list);
	}

}
