import java.util.Scanner;

class currencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates (example rates for INR to other currencies)
        double inrToUSD = 0.012;
        double inrToEur = 0.011;
        double inrToGbp = 0.0097;
        double inrToJpy = 1.78;

        System.out.println("Currency Converter");
        System.out.print("Enter amount in INR: ");
        double inrAmount = scanner.nextDouble();

        System.out.println("Select a currency to convert to:");
        System.out.println("1. American Dollar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. British Pound (GBP)");
        System.out.println("4. Japanese Yen (JPY)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double convertedAmount = 0.0;
        String currency = "";

        switch (choice) {
            case 1:
                convertedAmount = inrAmount * inrToUSD;
                currency = "USD";
                break;
            case 2:
                convertedAmount = inrAmount * inrToEur;
                currency = "EUR";
                break;
            case 3:
                convertedAmount = inrAmount * inrToGbp;
                currency = "GPD";
                break;
            case 4:
                convertedAmount = inrAmount * inrToJpy;
                currency = "JPY";
                break;
            default:
                System.out.println("Invalid choice");
                scanner.close();
                return;
        }

        System.out.println("Converted amount: " + convertedAmount + " " + currency);
        scanner.close();
    }
}