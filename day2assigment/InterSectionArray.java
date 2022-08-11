package week1.day2assigment;

import java.util.Arrays;

public class InterSectionArray {
	

public static void main(String[] args) {
	int[] numbers={3,2,11,4,6,7};
	int[] numbers2={1,2,8,4,9,7};

	
	Arrays.sort(numbers);
	for (int i = 0; i < numbers.length; i++) {
		Arrays.sort(numbers2);
		for (int i2 = 0; i2 < numbers2.length; i2++) {
			
			if(numbers[i]==numbers2[i2]) {
				System.out.println(numbers[i]);
}}}}}

