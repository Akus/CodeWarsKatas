/*7kyu
 In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". 
 You have function with one side of the DNA (string, except for Haskell); 
 you need to get the other complementary side. DNA strand is never empty or there is no DNA at all 
 (again, except for Haskell).
 */

package coms.akosbodor.DNA_strand_1;

public class DnaStrand {

	public static String makeComplement(String dna) {

		StringBuilder newDNA = new StringBuilder(dna);

		// System.out.println(dna.length());
		// before Java 5:

		for (int i = 0; i < dna.length(); i++) {

			char c = dna.charAt(i);
			System.out.println("c is: " + c);

			switch (c) {
			case 'A':
				newDNA.setCharAt(i, 'T');
				break;
			case 'T':
				newDNA.setCharAt(i, 'A');
				break;
			case 'C':
				newDNA.setCharAt(i, 'G');
				break;
			case 'G':
				newDNA.setCharAt(i, 'C');
				break;
			default:
				System.out.println("Wrong character in DNA: " + c);
			}

			// with enchanced for loop after Java 5:
			// it won't work as newDNA.setCharAt needs the index of the char
		}
		return newDNA.toString();

	}

	public static void main(String[] args) {

		System.out.println("Test 1 result should be: TTTT \nYour result is: " + makeComplement("AAAA"));
		System.out.println("Test 2 result should be: TAACG \nYour result is: " + makeComplement("ATTGC"));
		System.out.println("Test 3 result should be: CATA \nYour result is: " + makeComplement("GTAT"));
		// System.out.println("Test 4 result should be: A \nYour result is: " +
		// getMiddle("A"));
	}

}
