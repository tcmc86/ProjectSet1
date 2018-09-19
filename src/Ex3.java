import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {

        String name, lenghtAsString, breadthAsString;
        float lenght, breadth, totalArea, cost = 33.50f, totalCost;



        name = JOptionPane.showInputDialog("Please enter your name: ");

        lenghtAsString = JOptionPane.showInputDialog("Please enter the lenght: ");
        lenght = Float.parseFloat(lenghtAsString);

        breadthAsString = JOptionPane.showInputDialog("Please enter the breadth: ");
        breadth = Float.parseFloat(breadthAsString);

        totalArea = (lenght * breadth);
        totalCost = (totalArea * cost);

        JOptionPane.showMessageDialog(null,"Name: " + name + "\nLenght: " + lenght + " m." +
                "\nBreadth: " + breadth + " m." + "\n\nYour total area calculated is: " + String.format("%.2f",totalArea) + " sq. m." +
                "\n\nYour total cost is: " + " €" + String.format("%.2f",totalCost),"Final Total",JOptionPane.INFORMATION_MESSAGE);


    }


}