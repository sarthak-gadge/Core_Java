package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	public static void main(String[] args) {

		List<Integer> numlist = Arrays.asList(22, 13, 17, 11, 20, 15, 14, 18, 12);
//		sorted number list as a list

//		converted list into stream
		List<Integer> sortinglist = numlist.stream().sorted().collect(Collectors.toList());

		for (Integer i : sortinglist) {
			System.out.println(i);

		}
	}

}
