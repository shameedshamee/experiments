
import java.util.Scanner;

import static converters.dollarConverter.dollarConversion;
import static converters.euroConverter.euroConversion;
import static converters.poundCoverter.poundConversion;
import static converters.rupeeConverter.rupeeConversion;
import static converters.yenConverter.yenConversion;

public class currencyCode {
    public static void main(String[] args){
        int code;
        double amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency code \n " +
                "1 - Rupess \n " +
                "2 - Dollar \n " +
                "3 - Pound \n " +
                "4 - Euro \n " +
                "5 - Yen");
        code =  input.nextInt();

        selectedInput(code);

        amount = input.nextInt();

        rupeeConversion(amount,code);
        dollarConversion(amount,code);
        poundConversion(amount,code);
        euroConversion(amount,code);
        yenConversion(amount,code);

    }

    public static void selectedInput(int code){
        switch (code) {
            case 1:
                System.out.println("Enter amount in Rupess:");
                break;
            case 2:
                System.out.println("Enter amount in Dollar:");
                break;
            case 3:
                System.out.println("Enter amount in Pound:");
                break;
            case 4:
                System.out.println("Enter amount in Euro:");
                break;
            case 5:
                System.out.println("Enter amount in Yen:");
                break;
            default:
                System.out.println("Invalid Code");
                break;
        }
    }
}



/*
Procedure for conversion | Algorithm
getCurrency(): java.util.Currency.getCurrency() method returns ISO 4217 currency code of the passed currency argument.
getInstance(): java.util.Currency.getInstance() method creates currency instance for Currency code.
getDefaultFractionDigits(): java.util.Currency.getDefaultFractionDigits() method returns default number of argumented currency fraction digits.
getDisplayName(): java.util.Currency.getDisplayName() method generates the currency name of the argumented currency code.
getSymbol(): java.util.Currency.getSymbol() method returns Currency symbol for the argumented currency code. In case, no symbol is returned normal currency code will be returned.
 */