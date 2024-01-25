/**
 * Enum for style of the instrument
 */

public enum Style {
    AMANDINE, FLORENTINE, ANY;

    /**
     * Return the string according to an enum
     * 
     * @return String
     */
    public String toString()
    {
        switch (this)
        {
            case AMANDINE: return "Amandine";
            case FLORENTINE: return "Florentine";
            default: return "undefined";
        }
    }
}
