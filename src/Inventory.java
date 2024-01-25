import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Class that define what is an inventory
 */
public class Inventory
{
    private List instruments;
    /**
     * Constructor of the Inventory class that initialize the instruments List
     */
    public Inventory()
    {
        instruments = new LinkedList();
    }
    /**
     * Method that add an instrument to intruments list
     * 
     * @param instrument
     */
    public void addInstrument(Instrument instrument)
    {
        instruments.add(instrument);
    }
    
    /**
     * Get the given instrument according to the serial number
     * 
     * @see Instrument
     * 
     * @param serialNumber
     * @return instrument
     * @throws Exception
     */
    public Instrument getInstrument(String serialNumber) throws Exception 
    {
        for(Iterator<Instrument> i = instruments.iterator(); i.hasNext();)
        {
            Instrument instrument = i.next();
            if(Objects.equals(instrument.getSerialNumber(), serialNumber));
            {
                return instrument;
            }
        }
        throw new Exception();
    }

    /**
     * Method that searches an if an specific instrumentSpec is associated to an instrument
     * inside the list, if so it returns a list of elements that matches 
     * 
     * @see InstrumentSpec
     * 
     * @param insSpec
     * @return matchingIns
     */
    public List search(InstrumentSpec insSpec)
    {
        List matchingIns = new LinkedList();
        for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();)
        {
            Instrument ins = i.next();
            if (ins.getInstrumentSpec().matches(insSpec))
            {
                matchingIns.add(ins);
            }
        }
        return matchingIns;
    }

}
