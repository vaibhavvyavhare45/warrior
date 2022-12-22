package com.warrior.interviewprogram;

public class WordOccur {
	public static void main(String[] args) {
		int wordsLength, i, count, j, k;
		String s = "india is my country india has 28 state";
		String words[] = s.split(" ");
		wordsLength = words.length;

		for (i = 0; i < wordsLength; i++) {
			String word = words[i];
			count = 1;
			for (j = (i + 1); j < (wordsLength - 1); j++) {
				if (word.equals(words[j])) {
					count++;
					for (k = j; k < (wordsLength - 1); k++) {
						words[k] = words[k + 1];
					}
					wordsLength--;
					j--;
				}
			}
			System.out.print("\n\n\t" + word + " <==> " + count);

		}

	}

}