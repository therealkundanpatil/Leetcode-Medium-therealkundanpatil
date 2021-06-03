package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data implements Comparable<Data> {

	private int number;
	private int power;

	public Data() {

	}

	public Data(int number, int power) {
		this.number = number;
		this.power = power;
	}

	public int getNumber() {
		return this.number;
	}

	public int getPower() {
		return this.power;
	}

	public String toString() {
		return this.number + " -> " + this.power;
	}

	public int compareTo(Data d) {
		int toReturn = 0;
		if (this.getPower() > d.getPower()) {
			toReturn = 1;
		} else if (this.getPower() < d.getPower()) {
			toReturn = -1;
		} else {
			if (this.getNumber() > d.getNumber()) {
				toReturn = 1;
			} else {
				toReturn = -1;
			}
		}

		return toReturn;
	}

}

public class SortIntegersByPowerValue {
	
	public static int getKth(int lo, int hi, int k) {
		List<Data> numberPowerList = new ArrayList<>();
		
		for (int number = lo; number <= hi; number++) {
			int numberCopy = number;
			int power = 0;
			while (numberCopy != 1) {
				if (numberCopy % 2 == 0) {
					numberCopy = numberCopy / 2;
				} else {
					numberCopy = 3 * numberCopy + 1;
				}
				power++;
			}
			numberPowerList.add(new Data(number, power));
		}
		
		Collections.sort(numberPowerList);

		return numberPowerList.get(k - 1).getNumber();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getKth(12, 15, 2));
	}

}
