
    import java.util.Scanner;

    public class Main {

        // Single number ki table
        public static void generateTable(int number) {
            System.out.println("\nMultiplication Table of " + number);
            System.out.println("------------------------");

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %2d = %d%n", number, i, number * i);
            }
        }

        // Range of numbers ki tables
        public static void generateTablesInRange(int start, int end) {

            for (int number = start; number <= end; number++) {

                System.out.println("\nTable of " + number);
                System.out.println("------------------------");

                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d x %2d = %d%n",
                            number, i, number * i);
                }
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("===== MULTIPLICATION TABLE GENERATOR =====");
            System.out.println("1. Generate Single Table");
            System.out.println("2. Generate Tables in Range");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    generateTable(number);
                    break;

                case 2:
                    System.out.print("Enter starting number: ");
                    int start = sc.nextInt();

                    System.out.print("Enter ending number: ");
                    int end = sc.nextInt();

                    if (start <= end) {
                        generateTablesInRange(start, end);
                    } else {
                        System.out.println("Invalid range! Start should be smaller than end.");
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

            sc.close();
        }
    }
