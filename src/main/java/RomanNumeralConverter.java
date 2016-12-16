/**
 * Created by khalleb on 16/12/16.
 */
public class RomanNumeralConverter {
    public String convert(Integer oneArabicNumber) {
        StringBuilder result = new StringBuilder();
         for(int i=1;i<=oneArabicNumber;i++){
             result.append("I");
         }

        return result.toString();
    }
}
