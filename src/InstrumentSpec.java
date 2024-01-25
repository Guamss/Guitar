import java.util.HashMap;
import java.util.Iterator;

/**
 * Class that define what are the specs of an instrument
 */

public class InstrumentSpec
{
    HashMap<String,Object> instrumentSpecMap;

    /**
     * Contructor of InstrumentSpec that initialize the instrumentSpecMap hashmap
     * 
     * @param hashMapInsSpec
     */
    public InstrumentSpec(HashMap<String, Object> hashMapInsSpec)
    {
        instrumentSpecMap = hashMapInsSpec;
    }

    /**
     * Getter that return the instrumentSpecMap hashmap
     * 
     * @return instrumentSpecMap
     */
    public HashMap<String, Object> getProperties()
    {
        return instrumentSpecMap;
    }

    /**
     * Method that return boolean if this and the given param matches 
     * according to the specs of the specs
     * 
     * @param otherSpec
     * @return boolean
     */

    public boolean matches(InstrumentSpec otherSpec)
    {
        for (Iterator<String> i = otherSpec.getProperties().keySet().iterator(); i.hasNext();)
        {
            String key = i.next();
            if (!(otherSpec.getProperties().get(key).equals(this.getProperties().get(key))))
            {
                return false;
            }
        }
        return true;
    }
}
