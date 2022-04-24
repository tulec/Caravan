package cardstatic;
import java.io.*;
import java.util.*;

public class Static {	
	// Rank constants:

	// Rank names
	public static final String[] ranks = {
        "2",
        "3",
        "4",
        "5",
		"6",
		"7",
		"8",
		"9",
		"10",
		"Jack",
		"Queen",
		"King",
		"Ace",
        "Joker"
	};


	// Rank values
	public static final Map<String, Integer> values;
	static {
		Map<String, Integer> valuesMap = new HashMap<String, Integer>();
        valuesMap.put("2", 2);
        valuesMap.put("3",3);
        valuesMap.put("4", 4);
        valuesMap.put("5", 5);
		valuesMap.put("6", 6);
		valuesMap.put("7", 7);
		valuesMap.put("8", 8);
		valuesMap.put("9", 9);
		valuesMap.put("10", 10);
		valuesMap.put("Jack", 11);
		valuesMap.put("Queen", 12);
		valuesMap.put("King", 1);
		valuesMap.put("Ace", 1);
		values = Collections.unmodifiableMap(valuesMap);
	}

	// Suit constants:
	public static final String[] suits = {
		"Hearts",
		"Diamonds",
		"Clubs",
		"Spades"
	};

	// Colors constants: 
	public static final Map<String, String> colors;
	static {
		Map<String, String> colorsMap = new HashMap<String, String>();
		colorsMap.put("Hearts", "Red");
		colorsMap.put("Diamonds", "Red");
		colorsMap.put("Clubs", "Black");
		colorsMap.put("Spades", "Black");
		colors = Collections.unmodifiableMap(colorsMap);
	}
}