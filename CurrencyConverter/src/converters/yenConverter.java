package converters;

import java.text.DecimalFormat;

public class yenConverter {

    public static void yenConversion(double amount,int code){
        double conv_amount;
        DecimalFormat f = new DecimalFormat("##.###");
        switch (code){
            case 1:
                conv_amount = amount/0.55;
                break;
            case 2:
                conv_amount = amount*120.90;
                break;
            case 3:
                conv_amount = amount*179.89;
                break;
            case 4:
                conv_amount = amount*131.85;
                break;
            case 5:
                conv_amount = amount;
                break;
            default:
                conv_amount = amount;
                break;

        }
        System.out.println("Yens : "+ f.format(conv_amount));
    }
}
