import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {


    public List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactorList = new ArrayList<>();
        int remainder = number;
        int divisor = 2;
        while(remainder>1) {
            while (remainder%divisor == 0) {
                primeFactorList.add(divisor);
                remainder/=divisor;
            }
            divisor++;
        }
        return primeFactorList;
    }
}
