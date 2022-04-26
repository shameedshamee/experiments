package converters;

import java.text.DecimalFormat;

public class poundCoverter {
    public static void poundConversion(double amount,int code){
        double conv_amount;
        DecimalFormat f = new DecimalFormat("##.###");
        switch (code){
            case 1:
                conv_amount = amount/98;
                break;
            case 2:
                conv_amount = amount*0.67;
                break;
            case 3:
                conv_amount = amount;
                break;
            case 4:
                conv_amount = amount*0.73;
                break;
            case 5:
                conv_amount = amount*0.01;
                break;
            default:
                conv_amount = amount;
                break;

        }
        System.out.println("Pounds : "+ f.format(conv_amount));
    }

}
