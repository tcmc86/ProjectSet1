import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {

        String fullName, caps, surname;
        char firstLetter;
        int numberOfLetters;

        fullName = JOptionPane.showInputDialog("Please enter your full name, including middle name if available: ");

        numberOfLetters = fullName.length();

        firstLetter = fullName.charAt(0);

        caps = fullName.toUpperCase();

        surname = fullName.substring(5);

        JOptionPane.showMessageDialog(null,"Your name is: " + fullName +
                "\nThe number of letters in your name is: " + numberOfLetters + "\nThe first letter in you name is: " + firstLetter +
                "\nYou name in all capital letters: " + caps + "\nYour surname is: " + surname,"Results",JOptionPane.INFORMATION_MESSAGE);

    }
}
