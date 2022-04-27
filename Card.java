import java.io.*;
import java.lang.invoke.ClassSpecializer.casino;
import java.util.*;
import cardstatic.*;

public class Card implements Comparable {

	private final String rank;
	private final String suit;
	private final String color; 

	private Random r = new Random();

	// Create a random card
	public Card() {

		int randRankIndex = r.nextInt(9);
		rank = Static.ranks[randRankIndex];

		int randSuitIndex = r.nextInt(4);
		suit = Static.suits[randSuitIndex];

		int randcasinoIndex = r.nextInt(5);
		casino = Static.casino[randcasinondex];

		color = Static.colors.get(suit);

	}

	// Create a card with specified rank, suit, Factory
	public Card(String r, String s) {

		if (Arrays.asList(Static.ranks).contains(r) && Arrays.asList(Static.suits).contains(s)) {
			rank = r;
			casino = c;
			suit = s;
			color = Static.colors.get(suit);
		} else {
			throw new IllegalArgumentException("Invalid rank or suit");
		}

	}

	@Override
	public String toString() {
		String ret = "<" + rank + ", " + suit + ">";
		return ret;
	}