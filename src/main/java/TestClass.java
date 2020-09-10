import javax.measure.unit.NonSI;
import javax.measure.unit.UnitFormat;

public class TestClass {
    public static void main(String[] args) {
        UnitFormat.getInstance().alias(NonSI.FAHRENHEIT, "F");
        System.out.println("done");
    }
}
