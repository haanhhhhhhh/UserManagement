package Common;


import java.util.Scanner;


public class Library {
    protected Scanner sc;

    public Library() {
        sc = new Scanner(System.in);
    }
    public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
    
    public int getIntNoLimit(String promt) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                return a;
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
    }

//    public String getString(String mes){
//        System.out.print(mes);
//        return sc.nextLine();
//    }
    
    public String inputString(String mes) {
        System.out.print(mes);
        while (true) {
            String result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
}
