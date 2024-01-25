/**
 * Enum for the different woods of an instrument
 */
public enum Wood
{
    ALDER, MAHOGANY, ADIRONDACK, BRAZILIAN_ROSEWOOD, INDIAN_ROSEWOOD, CEDAR, COCOBOLO, MAPLE, SITKA, ANY;
    /**
     * Return the string according to an enum
     * 
     * @return String
     */
    public String toString()
    {
        switch (this)
        {
            case ALDER: return "Alder";
            case MAHOGANY: return "Mahogany";
            case ADIRONDACK: return "Adirondack";
            case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
            case INDIAN_ROSEWOOD: return "Indian Rosewood";
            case CEDAR: return "Cedar";
            case COCOBOLO: return "Cocobolo";
            case MAPLE: return "Maple";
            case SITKA: return "Sitka";
            default: return "undefined";
        }
    }
}