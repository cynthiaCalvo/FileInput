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
			
			while((character = br.read()) != -1) {
				char c = (char)character;
				if((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z')) {
					wordLength+=1;
					word+=c;
				}else {
					avgLength+=wordLength;
					avgLength = avgLength/2;
					wordLength = 0;
					count+=1;
					System.out.print(word);
					word = "";
				}
			}
			
			System.out.println("Average Length: " + avgLength);
			System.out.println("Word Count: " + count);
			
			reader.close();
			
		}catch(Exception e) {
			System.out.println("That doesn't work");
		}

	}

}
