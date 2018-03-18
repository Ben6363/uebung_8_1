
package uebung_8_1;
import javax.swing.*;

public class Palindromprüfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Bitte geben Sie das zu überprüfende Wort ein.");
		
		
		String wordforward = JOptionPane.showInputDialog(null);
		wordforward = wordforward.toUpperCase();
		
		char[] wordA = new char[wordforward.length()];
		for (int i = 0; i <= wordforward.length()-1; i++){
			wordA[i] = wordforward.charAt(i);
		}
		
		char[] wordB = new char [wordforward.length()];
		for (int i=0; i <= wordforward.length()-1; i++){
			wordB[i] = wordA[wordforward.length() - 1 - i];
		}
		
		String wordbackwards = "";
		for (int i = 0; i <= wordforward.length()-1; i++){
			wordbackwards = wordbackwards + Character.toString(wordB[i]);
		}
		
		if (wordforward.equals(wordbackwards) == true){
			System.out.println("Bei dem Wort ''" + wordforward + "'' handelt es sich um ein Palindrom.");
		}
		else {
			System.out.println("Bei dem Wort ''" + wordbackwards + "'' handelt es sich um kein Palindrom.");
		}

		
		
	}

}
