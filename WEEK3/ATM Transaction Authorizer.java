public class ATMTransactionAuthorizer {
    public static void main(String[] args) {
        String username = "Hxnygrc";
        int pin = 9988;
        double balance = 10000.00;
        double withdrawal = 2000.00;
        double dailyLimit = 5000.00;
        double dailyWithdrawn = 1000.00;

        String tier = "";
        double feeRate = 0.0;
        double fee;
        double totalAmount;

        // 1. Check username and PIN
        if (username.equals("Hxnygrc")) {
            if (pin == 9988) {

                // 2. Determine account tier
                if (balance >= 50000) {
                    tier = "Platinum";
                } else if (balance >= 20000) {
                    tier = "Gold";
                } else if (balance >= 5000) {
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }

                // 3. Select transaction fee using switch
                switch (tier) {
                    case "Platinum":
                        feeRate = 0.01;
                        break;
                    case "Gold":
                        feeRate = 0.02;
                        break;
                    case "Silver":
                        feeRate = 0.03;
                        break;
                    case "Bronze":
                        feeRate = 0.05;
                        break;
                }

                fee = withdrawal * feeRate;
                totalAmount = withdrawal + fee;

                // 4. Authorize withdrawal
                if (withdrawal > 0 && withdrawal <= balance) {
                    if (dailyWithdrawn + withdrawal <= dailyLimit) {
                        if (dailyWithdrawn + withdrawal + fee <= balance) {
                            System.out.println("Transaction APPROVED");
                            System.out.println("Account Tier: " + tier);
                            System.out.println("Withdrawal: PHP " + withdrawal);
                            System.out.println("Transaction Fee: PHP " + fee);
                            System.out.println("Total Amount: PHP " + totalAmount);
                            System.out.println("Remaining Balance: PHP "
                                    + (balance - totalAmount));
                        } else {
                            System.out.println("DENIED: Insufficient balance for withdrawal and fee.");
                        }
                    } else {
                        System.out.println("DENIED: Daily withdrawal limit exceeded.");
                    }
                } else {
                    System.out.println("DENIED: Invalid withdrawal amount or insufficient balance.");
                }

            } else {
                System.out.println("DENIED: Incorrect PIN.");
            }
        } else {
            System.out.println("DENIED: Incorrect username.");
        }
    }
}

