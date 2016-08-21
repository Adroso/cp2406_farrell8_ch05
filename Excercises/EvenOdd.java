import javax.swing.*;

/**
 * Created by Adroso360 on 22/08/2016.
 */
public class EvenOdd {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Interger Pls"));
        if(num % 2 == 0)
            System.out.println("Number is even Bro");
        else
            System.out.println("Numbers Odd");


    }
}
