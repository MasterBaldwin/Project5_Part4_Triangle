import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import java.util.regex.Pattern;

public class Triangle {
public static void main(String[] args) {
    int numOfRows;
    String numOfRowsText;

    JOptionPane.showMessageDialog(null, "Welcome to the Game of Triangle.");
    numOfRowsText = "";

    while (true) {
        numOfRowsText = JOptionPane.showInputDialog("Please enter an odd number [1-20]: ");
        if (numOfRowsText.isEmpty() || Pattern.matches("[a-zA-Z]+", numOfRowsText)) {
            numOfRows = Integer.parseInt(numOfRowsText);
            if (numOfRows < 0 || numOfRows > 20) {
                continue;
            } else {
                JOptionPane.showMessageDialog(null, "Thanks, here is the triangle with 5 rows:");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "The number must be odd numbers between 1 and 20.");
    }

    for (int i = 0; i < numOfRows; i++) {
        //System.out.print();
    }
}
}
