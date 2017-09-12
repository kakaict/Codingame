package codingame;

import java.util.*;
import java.util.Scanner;

/**
 *
 * khaitq on 12 sept. 2017
 * 
 */
 /*
  	ASCII art allows you to represent forms by using characters. To be precise, in our case, these forms are words.
  	For example, the word "MANHATTAN" could be displayed as follows in ASCII art:

	# #  #  ### # #  #  ### ###  #  ###
	### # # # # # # # #  #   #  # # # #
	### ### # # ### ###  #   #  ### # #
	# # # # # # # # # #  #   #  # # # #
	# # # # # # # # # #  #   #  # # # #
	 
	​Your mission is to write a program that can display a line of text in ASCII art in a style you are given as input.

	Input
	Line 1: the width L of a letter represented in ASCII art. All letters are the same width.
	Line 2: the height H of a letter represented in ASCII art. All letters are the same height.
	Line 3: The line of text T, composed of N ASCII characters.
	Following lines: the string of characters ABCDEFGHIJKLMNOPQRSTUVWXYZ? Represented in ASCII art.
	
	Output
	The text T in ASCII art.
	The characters a to z are shown in ASCII art by their equivalent in upper case.
	The characters that are not in the intervals [a-z] or [A-Z] will be shown as a question mark in ASCII art.


	Example 1
	Input
	4
	5 
	E
	 #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### 
	# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # 
	### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## 
	# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       
	# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  
	
	Output
	### 
	#   
	##  
	#   
	### 

 */

public class AsciiArt {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int H = in.nextInt();
		if (in.hasNextLine()) {
			in.nextLine();
		}
		String T = in.nextLine();

		char[][] table = new char[H][28 * L];

		for (int i = 0; i < H; i++) {
			String ROW = in.nextLine();
			char[] ch = ROW.toCharArray();
			table[i] = ch;
		}

		List<Character> list = new ArrayList<Character>();

		for (char a = 'A'; a <= 'Z'; a++) {
			list.add(a);
		}

		char[] input = T.toUpperCase().toCharArray();

		char[][] result = new char[H][L * (input.length)];

		int x = 0;
		for (char c : input) {

			int col = list.indexOf(Character.toUpperCase(c));

			if (col < 0) {
				col = 26 * L;
			} else {
				col = col * L;
			}

			for (int i = 0; i < H; i++) {
				int k = 0;

				for (int j = col; j < col + L; j++) {
					result[i][x + k] = table[i][j];
					k++;
				}
			}
			x += L;
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

}
