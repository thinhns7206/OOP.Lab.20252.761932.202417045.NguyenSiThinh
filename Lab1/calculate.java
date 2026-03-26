import javax.swing.JOptionPane;
public class calculate {
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Plese enter the first number:", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, "Plese enter the second number:", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String result = "The answer between " + num1 + " and " + num2 + " is:\n";
        result += "Sum:" + sum +"\n";
        result += "Difference:" + difference +"\n";
        result += "Product:" + product +"\n";
        if(num2 != 0){
            double quotient = num1 / num2;
            result += "Quotient:" + quotient +"\n";
        }
        else{
            result += "Quotient: Cannot divide by zero" +"\n";
        }
        JOptionPane.showMessageDialog(null, result, "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
