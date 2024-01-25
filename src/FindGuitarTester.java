import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Client class that test the application
 */

public class FindGuitarTester {
  /**
   * Main method
   * 
   * @see Inventory
   * @see Instrument
   * @see InstrumentSpec
   * 
   * @param args
   */
    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        HashMap<String, Object> hash1 = new HashMap<String, Object>();
        hash1.put("Builder", Builder.FENDER);
        hash1.put("Model", "Stratocastor");
        hash1.put("Type", Type.ELECTRIC);
        hash1.put("BackWood", Wood.COCOBOLO);
        hash1.put("TopWood", Wood.COCOBOLO);
        hash1.put("Strings", 6);
        InstrumentSpec whatErinLikes = new InstrumentSpec(hash1);
        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
          System.out.println("Erin, you might like these guitars:");
          for (Iterator<Instrument> i = matchingGuitars.iterator(); i.hasNext(); ) {
            Instrument guitar = i.next();
            InstrumentSpec spec = guitar.getInstrumentSpec();
            System.out.println("  We have a " +
              spec.getProperties().get("Builder") + " " + spec.getProperties().get("Model") + " " +
              spec.getProperties().get("Type") + " guitar:\n     " +
              spec.getProperties().get("BackWood") + " back and sides,\n     " +
              spec.getProperties().get("TopWood") + " top.\n  You can have it for only $" +
              guitar.getPrice() + "!\n  ----");
            
          }
        } else {
          System.out.println("Sorry, Erin, we have nothing for you.");
        }
      }
    public static void initializeInventory(Inventory inventory)
    {
      HashMap<String, Object> hash1 = new HashMap<String, Object>();
      hash1.put("Builder", Builder.FENDER);
      hash1.put("Model", "Stratocastor");
      hash1.put("Type", Type.ELECTRIC);
      hash1.put("BackWood", Wood.COCOBOLO);
      hash1.put("TopWood", Wood.COCOBOLO);
      hash1.put("Strings", 6);
      inventory.addInstrument(new Instrument("ABCDEF", 299.99, new InstrumentSpec(hash1)));
    } 
}
