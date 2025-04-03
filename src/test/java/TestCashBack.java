import org.example.CashBackService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestCashBack {
    @Test
    public void shouldCheckRegBelow(){
        CashBackService cashBack = new CashBackService();
        double act = cashBack.cashBackCalculation(5000, true);
        double exp = 250;
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void shouldCheckRegAbove(){
        CashBackService cashBack = new CashBackService();
        double act = cashBack.cashBackCalculation(110000, true);
        double exp = 5000;
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void shouldCheckUngerBelow(){
        CashBackService cashBack = new CashBackService();
        double act = cashBack.cashBackCalculation(5000, false);
        double exp = 50;
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void shouldCheckUnRegAbove(){
        CashBackService cashBack = new CashBackService();
        double act = cashBack.cashBackCalculation(5000000, false);
        double exp = 5000;
        Assertions.assertEquals(exp,act);
    }
}
