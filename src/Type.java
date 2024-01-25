/**
 * Enum of the type of an instrument
 */

public enum Type
{
    ELECTRIC, ACOUSTIC, ANY;
    /**
     * Return the string according to an enum
     * 
     * @return String
     */
    public String toString()
    {
        switch (this)
        {
            case ELECTRIC: return "Electric";
            case ACOUSTIC: return "Acoustic";
            default: return "undefined";
        }
    }
}
