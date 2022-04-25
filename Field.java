import java.io.*;
import java.util.*;
import cardstatic.*;

public class Field {

	// ArrayList of Pairs

	private ArrayList<Pair> pairs;
	private ArrayList<String> playedRanks;
	private boolean completed;

	// Empty field
	public Field() {
		pairs = new ArrayList<Pair>();
		playedRanks = new ArrayList<String>();
		completed = false;
	}
