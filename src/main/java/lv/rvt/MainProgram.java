package lv.rvt;
import java.util.*;
 
public class   {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public class MainProgram {
        public static void main(String[] args) {
            PaymentCard card = new PaymentCard(50);
            
            System.out.println(card);
        }
    }
}


