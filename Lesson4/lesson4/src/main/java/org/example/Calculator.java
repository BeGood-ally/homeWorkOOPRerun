package org.example;

import java.util.Arrays;
import java.util.List;

public class Calculator <D> {

    D dec;
    public double sum(List <? extends Number> array){
        double result = 0;
        for (int i = 0; i < array.size(); i++) {
            result += array.get(i).doubleValue();
        }
        return result;
    }

    public double mult(List <? extends Number> array){
        double result = 1;
        for (int i = 0; i < array.size(); i++) {
            result *= array.get(i).doubleValue();
        }
        return result;
    }

    public double div(List <? extends Number> array){
        double result = array.get(0).doubleValue();
        for (int i = 1; i < array.size(); i++) {
            if (i == array.size()) {
                break;
            }
            else {
                result = result / array.get(i).doubleValue();
            }
        }
        return result;
    }
    public void dec_to_bin(D dec){
        int dec_conv = 0;
        if (dec instanceof String){
           dec_conv = Integer.parseInt(((String) dec).trim());
        }
        else if (dec instanceof Double){
            dec_conv = (int)Math.round((Double)dec);
        } else if (dec instanceof Integer) {
            dec_conv = (Integer) dec;
        }
        //int bin_number[] = new int[8];
        //int i = 1;
        //while(dec_conv != 0){
        //    bin_number[i++] = dec_conv%2;
        //    dec_conv = dec_conv/2;
        //}
        //for (int j = i - 1; j > 0 ; j--) {
        //    System.out.print(bin_number[j]);
        //}
        System.out.println(Integer.toBinaryString(dec_conv));
    }

    public void bin_to_dec(String bin){
        if(bin.length() != 8){
            System.out.println("нужен ввод восьмизначного бинарного числа");
        }
        else {
            System.out.println(Integer.parseInt(bin, 2));
        }
    }
}
