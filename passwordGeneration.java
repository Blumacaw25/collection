import java.util.Scanner;

public class passwordGeneration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Introduces program
        System.out.println("Hello! This is a password generator.");
        System.out.println("The password generator will spit out a unique password consisting of random characters.");
        System.out.print("Please type the length of the password you desire: ");

        // Asks for the length of password desired
        int length = scan.nextInt();
        System.out.print("\n");

        boolean again = true;
        // Runs random function n times until user says to stop
        while(again) {
            for (int i = 0; i < length; i++) {
                System.out.print(characterrandom());
            }
            System.out.println("\n");
            String option = "something";
            while (!option.equals("y") || option.equals("n")) {
                System.out.println("Would you like to run the program again (y / n)");
                option = scan.next();
                if (option.equals("y")) {
                again = true;
                System.out.print("\n");
                } else if (option.equals("n")) {
                    again = false;
                    break;
                } else {
                    again = true;
                    System.out.println("\nPlease type 'y' or 'n'\n");
            }
            }
        }
        System.out.println("Program terminated");
        // Runs random function n times
    }
    public static char characterrandom() {
        double x = Math.random() * 72;
        x++;
        int y = (int)x;
        switch(y) {
            case 1: return 'a';
            case 2: return 'b';
            case 3: return 'c';
            case 4: return 'd';
            case 5: return 'e';
            case 6: return 'f';
            case 7: return 'g';
            case 8: return 'h';
            case 9: return 'i';
            case 10: return 'j';
            case 11: return 'k';
            case 12: return 'l';
            case 13: return 'm';
            case 14: return 'n';
            case 15: return 'o';
            case 16: return 'p';
            case 17: return 'q';
            case 18: return 'r';
            case 19: return 's';
            case 20: return 't';
            case 21: return 'u';
            case 22: return 'v';
            case 23: return 'w';
            case 24: return 'x';
            case 25: return 'y';
            case 26: return 'z';
            case 27: return 'A';
            case 28: return 'B';
            case 29: return 'C';
            case 30: return 'D';
            case 31: return 'E';
            case 32: return 'F';
            case 33: return 'G';
            case 34: return 'H';
            case 35: return 'I';
            case 36: return 'J';
            case 37: return 'K';
            case 38: return 'L';
            case 39: return 'M';
            case 40: return 'N';
            case 41: return 'O';
            case 42: return 'P';
            case 43: return 'Q';
            case 44: return 'R';
            case 45: return 'S';
            case 46: return 'T';
            case 47: return 'U';
            case 48: return 'V';
            case 49: return 'W';
            case 50: return 'X';
            case 51: return 'Y';
            case 52: return 'Z';
            case 53: return '!';
            case 54: return '@';
            case 55: return '#';
            case 56: return '$';
            case 57: return '%';
            case 58: return '^';
            case 59: return '&';
            case 60: return '*';
            case 61: return '-';
            case 62: return '+';
            case 63: return '0';
            case 64: return '1';
            case 65: return '2';
            case 66: return '3';
            case 67: return '4';
            case 68: return '5';
            case 69: return '6';
            case 70: return '7';
            case 71: return '8';
            case 72: return '9';
            default: System.out.println("This should not be reached");
        }
        return 1;
    }
    
}
