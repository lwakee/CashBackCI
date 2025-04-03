import org.example.CashBackService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class TestParam {
    @ParameterizedTest
    @CsvSource (value = {"1000,true,100", "100,false,50","110000000, true, 5000"})
    public void testAllOptions (double ps, boolean st, double ex){
        CashBackService bonusCalc = new CashBackService();
        double actual = bonusCalc.cashBackCalculation(ps,st);
        Assertions.assertEquals(ex, actual);
    }
}
