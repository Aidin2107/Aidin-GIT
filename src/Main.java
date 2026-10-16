import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner Scan = new Scanner(System.in);
//
//        for (int i = 3; i > 0; i--) {
//            System.out.print("Enter PIN: ");
//            if (Scan.nextInt() == 1234) {
//                System.out.println("Access granted!");
//                return;
//            }
//            System.out.println("Incorrect PIN.\nAttempts left: " + (i - 1) + "\n");
//        }
//        System.out.println("Card blocked.");
//    }
    }
//     Task 2
//        int secret = 7;
//        Scanner Scan = new Scanner(System.in);
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("Enter your guess: ");
//            int guess = Scan.nextInt();
//
//            if (guess == secret) {
//                System.out.println("Correct!\nYou needed " + i + " attempts.");
//                return;
//            } else if (guess < secret) {
//                System.out.println("Too low!\n");
//            } else {
//                System.out.println("Too high!\n");
//            }
//        }
//
//        System.out.println("Game over!\nThe secret number was " + secret + ".");
//    }
//}
//  Task 3
//
//                Scanner Scan = new Scanner(System.in);
//                int pos = 0, neg = 0, zeros = 0, even = 0, odd = 0;
//
//                for (int i = 1; i <= 10; i++) {
//                    System.out.print("Enter number " + i + ": ");
//                    int n = Scan.nextInt();
//
//                    if (n > 0) pos++; else if (n < 0) neg++; else zeros++;
//                    if (n % 2 == 0) even++; else odd++;
//                }
//
//                System.out.println("\n===== STATISTICS =====");
//                System.out.println("Positive numbers: " + pos);
//                System.out.println("Negative numbers: " + neg);
//                System.out.println("Zeros: " + zeros);
//                System.out.println("Even numbers: " + even);
//                System.out.println("Odd numbers: " + odd);
//            }
//        }
//   Homework
//                Scanner Scan = new Scanner(System.in);
//                System.out.println("===== SIMPLE ATM =====");
//
//                for (int i = 3; i > 0; i--) {
//                    System.out.print("Enter your PIN: ");
//                    if (Scan.nextInt() == 1234) {
//                        System.out.println("Login successful!");
//                        double b = 100;
//                        int c;
//                        do {
//                            System.out.println("===== ATM MENU =====");
//                            System.out.println("1. Check balance");
//                            System.out.println("2. Deposit money");
//                            System.out.println("3. Withdraw money");
//                            System.out.println("4. Exit");
//                            System.out.println("Choose an option:");
//                            c = Scan.nextInt();
//                            if (c == 1) System.out.println("Current balance: " + b);
//                            else if (c == 2) { System.out.print("Enter deposit amount: ");
//                                double a = Scan.nextDouble(); if (a > 0)
//                                    System.out.println("Updated balance: " + (b += a));
//                                else System.out.println("Invalid amount."); }
//                            else if (c == 3) { System.out.print("Enter withdrawal amount: ");
//                                double a = Scan.nextDouble(); if (a > 0 && a <= b)
//                                    System.out.println("Updated balance: " + (b -= a));
//                                else System.out.println("Invalid amount or funds."); }
//                        } while (c != 4);
//                        return;
//                    }
//                    System.out.println("Incorrect PIN.");
//                    System.out.println("Attempts left:" + (i - 1));
//                }
//                System.out.println("Your account has been blocked.");
//            }
//        }
}
