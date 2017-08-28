/**
 * 
 */
package org.pravin;

import java.util.Arrays;
import java.util.List;

/**
 * @author Pravin_Karvande
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 52),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
        );

		int sum = people.stream()
		      .filter(p -> p.getFirstName().startsWith("C"))
		      .mapToInt(p -> 1)
		      .sum();
		
		System.out.println(sum);
	}

}

