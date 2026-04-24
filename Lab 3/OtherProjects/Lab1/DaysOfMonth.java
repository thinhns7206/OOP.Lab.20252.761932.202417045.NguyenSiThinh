import java.util.Scanner;
public class DaysOfMonth {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int month =0;
        int year = -1;
        while(true){
            System.out.print("Enter month (1-12): ");
            String monthInput = scanner.nextLine().trim();
            System.out.print("Enter year: ");
            String yearInput = scanner.nextLine().trim();
            month = getMonth(monthInput);
            try{
                year = Integer.parseInt(yearInput);}
             catch (NumberFormatException e) {
                year = -1;
            }
            if(month != -1 && year > 0){
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid month (1-12) and a positive integer for the year.");
            }
        }
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = 0;
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = isLeapYear ? 29 : 28;
                break;
        }
        System.out.println("Number of days in month " + month + " of year " + year + ": " + days);
        scanner.close();
    }
    public static int getMonth(String input){
        switch(input.toLowerCase()){
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            case "march": case "mar.": case "mar": case "3": return 3;
            case "april": case "apr.": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun.": case "jun": case "6": return 6;
            case "july": case "jul.": case "jul": case "7": return 7;
            case "august": case "aug.": case "aug": case "8": return 8;
            case "september": case "sept.": case "sep": case "9": return 9;
            case "october": case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return 0;
        }
    }
}
