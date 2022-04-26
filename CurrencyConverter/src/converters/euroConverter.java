package converters;

import java.text.DecimalFormat;

public class euroConverter {
    public static void euroConversion(double amount,int code){
        double conv_amount;
        DecimalFormat f = new DecimalFormat("##.###");
        switch (code){
            case 1:
                conv_amount = amount/72;
                break;
            case 2:
                conv_amount = amount*0.92;
                break;
            case 3:
                conv_amount = amount*1.36;
                break;
            case 4:
                conv_amount = amount;
                break;
            case 5:
                conv_amount = amount*0.01;
                break;
            default:
                conv_amount = amount;
                break;

        }
        System.out.println("Euros : "+ f.format(conv_amount));
    }

}
