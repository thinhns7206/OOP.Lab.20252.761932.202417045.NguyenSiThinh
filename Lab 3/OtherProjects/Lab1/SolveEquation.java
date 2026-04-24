import javax.swing.JOptionPane;
public class SolveEquation {
    public static void main(String[] args) {
        String menu = "Choose equation type: \n"
            + "1. Linear equation (ax + b = 0)\n"
            + "2. Linear system (2 equations with 2 unknowns)\n"
            + "3. Quadratic equation (ax^2 + bx + c = 0)\n"
            + "Enter 1, 2, or 3: ";
    String choiceStr = JOptionPane.showInputDialog(null, menu , "Menu Giải Phương Trình", JOptionPane.QUESTION_MESSAGE);
    if(choiceStr == null){
        System.exit(0);
    }
    int choice = Integer.parseInt(choiceStr);
    if(choice == 1){
        solveLinearEquation();
    } else if(choice == 2){
        solveLinearSystem();
    } else if(choice == 3){
        solveQuadraticEquation();
    } else {
        JOptionPane.showMessageDialog(null, "Invalid choice. Please enter 1, 2, or 3.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    System.exit(0);
    }
    public static void solveLinearEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a:", "Linear Equation", JOptionPane.QUESTION_MESSAGE));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient b:", "Linear Equation", JOptionPane.QUESTION_MESSAGE));
        if(a==0){
            if(b==0){
                JOptionPane.showMessageDialog(null, "The equation has infinite solutions.", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution.", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            double x = -b/a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void solveLinearSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a11:", "Linear System", JOptionPane.QUESTION_MESSAGE));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a12:", "Linear System", JOptionPane.QUESTION_MESSAGE));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant b1:", "Linear System", JOptionPane.QUESTION_MESSAGE));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a21:", "Linear System", JOptionPane.QUESTION_MESSAGE));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a22:", "Linear System", JOptionPane.QUESTION_MESSAGE));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant b2:", "Linear System", JOptionPane.QUESTION_MESSAGE));
        double D = a11*a22 - a12*a21;
        double Dx = b1*a22 - b2*a12;
        double Dy = a11*b2 - a21*b1;
        if(D!=0){
            double x = Dx/D;
            double y = Dy/D;
            JOptionPane.showMessageDialog(null, "The solution is:\nx = " + x + "\ny = " + y, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if(Dx==0 && Dy==0){
                JOptionPane.showMessageDialog(null, "The system has infinite solutions.", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public static void solveQuadraticEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a:", "Quadratic Equation", JOptionPane.QUESTION_MESSAGE));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient b:", "Quadratic Equation", JOptionPane.QUESTION_MESSAGE));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient c:", "Quadratic Equation", JOptionPane.QUESTION_MESSAGE));
        if(a==0){
            if(b==0){
                if(c==0){
                    JOptionPane.showMessageDialog(null, "The equation has infinite solutions.", "Result", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "The equation has no solution.", "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                double x = -c/b;
                JOptionPane.showMessageDialog(null, "The solution is x = " + x, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            double delta = b*b - 4*a*c;
            if(delta > 0){
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                JOptionPane.showMessageDialog(null, "The solutions are:\nx1 = " + x1 + "\nx2 = " + x2, "Result", JOptionPane.INFORMATION_MESSAGE);
            } else if(delta == 0){
                double x = -b/(2*a);
                JOptionPane.showMessageDialog(null, "The solution is x = " + x, "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no real solution.", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}