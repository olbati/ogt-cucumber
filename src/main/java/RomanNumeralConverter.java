import com.google.common.base.Strings;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by khalleb on 16/12/16.
 */
public class RomanNumeralConverter {
   static LinkedHashMap<Integer,String> romanSymbols= new LinkedHashMap<Integer,String>();
    static{
        romanSymbols.put(1000, "M");
        romanSymbols.put(900, "CM");
        romanSymbols.put(500, "D");
        romanSymbols.put(400, "CD");
        romanSymbols.put(100, "C");
        romanSymbols.put(90, "XC");
        romanSymbols.put(50, "L");
        romanSymbols.put(40, "XL");
        romanSymbols.put(10,"X");
        romanSymbols.put(9,"IX");
        romanSymbols.put(5,"V");
        romanSymbols.put(4, "IV");
       romanSymbols.put(1,"I");

    }
    public String convert(Integer oneArabicNumber) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer,String>romanSymbol:romanSymbols.entrySet()) {
            Integer divisor=romanSymbol.getKey();
        int repeatTimes=oneArabicNumber/divisor;
            oneArabicNumber=oneArabicNumber%divisor;
            result.append(Strings.repeat(romanSymbol.getValue(), repeatTimes));
        }

        return result.toString();
    }
}
