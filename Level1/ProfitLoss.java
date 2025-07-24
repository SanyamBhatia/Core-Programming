package Level1;
// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191.
public class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 150.0; // Cost price of the item
        double sellingPrice = 200.0; // Selling price of the item

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercent = (profit / costPrice) * 100;
            System.out.println("Profit: " + profit + ", Profit Percent: " + profitPercent + "%");
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercent = (loss / costPrice) * 100;
            System.out.println("Loss: " + loss + ", Loss Percent: " + lossPercent + "%");
        } else {
            System.out.println("No Profit, No Loss");
        }
    }
}
