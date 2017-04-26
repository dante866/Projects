package chaocipher;

import java.util.LinkedList;

public class Chaocipher {

    private LinkedList<Character> cipher, plain;
    private final int SIZE;

    public Chaocipher(String ciphertext, String plaintext) {
        cipher = new LinkedList<Character>();
        plain = new LinkedList<Character>();
        for(int i=0; i<ciphertext.length(); i++) {
            cipher.addLast(ciphertext.charAt(i));
            plain.addLast(plaintext.charAt(i));
        }
        SIZE = cipher.size();
    }

    public String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<text.length(); i++) {
            char plainChar = text.charAt(i);
            char cipherChar = encrypt(plainChar);
            sb.append(cipherChar);
            rotateDisks(cipherChar, plainChar);
        }
        
        return sb.toString();
    }

    public String decrypt(String text) {
        StringBuilder sb = new StringBuilder();
    
        for(int i=0; i<text.length(); i++) {
            char cipherChar = text.charAt(i);
            char plainChar = decrypt(cipherChar);
            sb.append(plainChar);
            rotateDisks(cipherChar, plainChar);
        }
        
        return sb.toString();
    }

    private char encrypt(char ch) {
        int i = plain.indexOf(ch);
        return cipher.get(i);
    }

    private char decrypt(char ch) {
        int i = cipher.indexOf(ch);
        return plain.get(i);
    }

    private void rotateDisks(char cipherChar, char plainChar) {
        int ind = cipher.indexOf(cipherChar);
        for(int i=0; i<ind; i++) {
            char ch = cipher.remove(0);
            cipher.addLast(ch);
        }
        char ch = cipher.remove(1);
        cipher.add(13, ch);
        

        ind = plain.indexOf(plainChar);
        for(int i=0; i<ind; i++) {
            ch = plain.remove(0);
            plain.addLast(ch);
        }
        ch = plain.remove(0);
        plain.addLast(ch);
        ch = plain.remove(2);
        plain.add(13, ch);
    }
}
