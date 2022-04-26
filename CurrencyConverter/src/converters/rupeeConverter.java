package converters;

import java.text.DecimalFormat;

public class rupeeConverter {
    public static void rupeeConversion(double amount,int code){
        double conv_amount;
        DecimalFormat f = new DecimalFormat("##.###");
        switch (code){
            case 1:
                conv_amount = amount;
                break;
            case 2:
                conv_amount = amount*66;
                break;
            case 3:
                conv_amount = amount*98;
                break;
            case 4:
                conv_amount = amount*72;
                break;
            case 5:
                conv_amount = amount*0.55;
                break;
            default:
                conv_amount = amount;
                break;

        }
        System.out.println("Rupees : "+ f.format(conv_amount));
    }

}
