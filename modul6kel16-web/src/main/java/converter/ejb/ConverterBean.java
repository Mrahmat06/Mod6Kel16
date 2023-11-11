package converter.ejb;

import java.text.DecimalFormat;
import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;

@Stateless
@LocalBean
public class ConverterBean implements ConverterBeanLocal {

    private DecimalFormat twoDigits = new DecimalFormat("0.00");

    public String ctof(double c) {
        String result = twoDigits.format(((c - 273.0) * 100) / 100.0);
        return result;
    }

    public String ftoc(double k) {
        String result = twoDigits.format(((k + 273.0) * 100) / 100.0);
        return result;
    }
}
