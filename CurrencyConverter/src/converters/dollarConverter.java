package converters;

import java.text.DecimalFormat;

public class dollarConverter {
    public static void dollarConversion(double amount,int code){
        double dollar;
        DecimalFormat f = new DecimalFormat("##.###");
        switch (code){
            case 1:
                dollar = amount/66;
                break;
            case 2:
                dollar = amount;
                break;
            case 3:
                dollar = amount*1.49;
                break;
            case 4:
                dollar = amount*1.09;
                break;
            case 5:
                dollar = amount*0.01;
                break;
            default:
                dollar = amount;
                break;

        }
        System.out.println("Dollars : "+ f.format(dollar));
    }

}
