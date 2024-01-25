/**
 * Class that describe what is an istrument
 */

public class Instrument
{
    private String serialNumber;
    private double price;
    private InstrumentSpec insSpec;

    /**
     * Constructor of class Instrument that initialize the fields
     * 
     * @param serialNumberarg
     * @param pricearg
     * @param insSpecarg
     */
    public Instrument(String serialNumberarg, double pricearg, InstrumentSpec insSpecarg)
    {
        this.serialNumber = serialNumberarg;
        this.price = pricearg;
        this.insSpec = insSpecarg;
    }

    /**
     * Getter that returns the serialNumber
     * 
     * @return serialNumber
     */
    public String getSerialNumber()
    {
        return serialNumber;
    }

    /**
     * Getter that returns the price
     * 
     * @return price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Getter that returns the instrumentSpec
     * 
     * @see InstrumentSpec
     * 
     * @return insSpec
     */
    public InstrumentSpec getInstrumentSpec()
    {
        return insSpec;
    }

    /**
     * Setter of the price field
     * 
     * @param newPrice
     */
    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }
}
