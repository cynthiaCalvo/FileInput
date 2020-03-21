/*
 * Cynthia C.
 * 20th March 2020
 * wil count word count and average word length of a file
 */
package fileInput1;

import java.io.*;

public class Input {

	public static void main(String[] args) {
		int count = 0, character, wordLength = 0;
		double avgLength = 0.0;
		String word = "";
		try {
			FileReader reader = new FileReader("file.txt");
			BufferedReader br = new BufferedReader(reader);
			
			//will loop until there are no lines left
			while((character = br.read()) != -1) {
				char c = (char)character;
				//will decide what to do depending on if the character is a letter or not
				if((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z')) {
					wordLength+=1;
					word+=c;
					System.out.print(c);
				}else {
					//will count when a word is finished
					if(wordLength != 0) {
						count+=1;
					}
					avgLength+=wordLength;
					wordLength = 0;
					word = "";
				}
			}
			
			avgLength = avgLength/count;
			
			System.out.println("\nAverage Length: " + Math.round(avgLength));
			System.out.println("Word Count: " + count);
			
			reader.close();
			
		}catch(Exception e) {
			System.out.println("That doesn't work");
		}

	}

}
