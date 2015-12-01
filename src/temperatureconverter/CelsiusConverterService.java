package temperatureconverter;

/**
 *
 * @author dvandenberge
 */
public class CelsiusConverterService {
    private final double FIVE_OVER_NINE=5/9;
    private final int THIRTY_TWO=32;
    
    public double convertToCelsius(double temp){
        return (temp-THIRTY_TWO)*FIVE_OVER_NINE;
    }
}
