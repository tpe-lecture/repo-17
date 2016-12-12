package tpe.testate.crypter;

/**
 * @author Ibrahim Dursun, 1531124.
 */

/**
 * Verschlüsselung und Entschlüsselung von Eingaben.
 */
public class CrypterImpl implements Crypter {

	/**
	 * Hilfsfunktion für die Verschlüsselung.
	 *
	 * @param input als einzelnes char.
	 * @return einzelnes char.
	 */
	private static char cryptoEncrypt(char input) {

		switch (input) {
		case 'e':
			return '3';
		case '3':
			return 'e';
		case 'l':
			return '1';
		case '1':
			return 'l';
		case 'o':
			return '0';
		case '0':
			return 'o';
		case 'a':
			return '4';
		case '4':
			return 'a';
		case 't':
			return '7';
		case '7':
			return 't';
		default:
			return input;
		}
	}

	/**
	 * Hilfsfunktion für die Entschlüsselung.
	 *
	 * @param input als einzelnes char.
	 * @return einzelnes char.
	 */
	private static char cryptoDecrypt(char input) {
		switch (input) {
		case 'e':
			return '3';
		case '3':
			return 'e';
		case 'l':
			return '1';
		case '1':
			return 'l';
		case 'o':
			return '0';
		case '0':
			return 'o';
		case 'a':
			return '4';
		case '4':
			return 'a';
		case 't':
			return '7';
		case '7':
			return 't';
		case 'b':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'm':
		case 'n':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
		case '2':
		case '5':
		case '6':
		case '8':
		case '9':
		case ' ':
			return input;
		default:
			throw new IllegalArgumentException("charakter " + input + " is not allowed");
		}
	}

	 /**
     * Verschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben,
     * so werden diese in Kleinbuchstaben umgewandelt. Ungültige Zeichen
     * werden ignoriert und nicht in den verschlüsselten Text übernommen.
     *
     * @param input Text, der verschlüsselt werden soll.
     * @return Verschlüsselter Text.
     */
	@Override
	public String encrypt(String input) {
		input = input.toLowerCase();
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z' || input.charAt(i) >= '0' && input.charAt(i) <= '9'
					|| input.charAt(i) == ' ') {
				char buffer;
				buffer = input.charAt(i);
				output = output + cryptoEncrypt(buffer);
			}
		}
		return output;
	}
	/**
     * Entschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben,
     * oder andere ungültige Zeichen, so wirft die Methode eine Ausnahme.
     *
     * @param input Text, der entschlüsselt werden soll.
     * @return Entschlüsselter Text.
     * @throws IllegalArgumentException Wird geworfen, wenn die Eingabe
     *      ungültige Zeichen (Großbuchstaben) enthält.
     */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		String output = "";
		char buffer;
		for (int i = 0; i < input.length(); i++) {
			buffer = input.charAt(i);
			output = output + cryptoDecrypt(buffer);
		}
		return output;
	}
}