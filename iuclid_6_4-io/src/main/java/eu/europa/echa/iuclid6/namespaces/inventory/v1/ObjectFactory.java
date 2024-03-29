
package eu.europa.echa.iuclid6.namespaces.inventory.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.echa.iuclid6.namespaces.inventory.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.echa.iuclid6.namespaces.inventory.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Inventory }
     * 
     */
    public Inventory createInventory() {
        return new Inventory();
    }

    /**
     * Create an instance of {@link Inventory.InventoryEntries }
     * 
     */
    public Inventory.InventoryEntries createInventoryInventoryEntries() {
        return new Inventory.InventoryEntries();
    }

    /**
     * Create an instance of {@link Inventory.InventoryEntries.InventoryEntry }
     * 
     */
    public Inventory.InventoryEntries.InventoryEntry createInventoryInventoryEntriesInventoryEntry() {
        return new Inventory.InventoryEntries.InventoryEntry();
    }

    /**
     * Create an instance of {@link Inventory.InventoryEntries.InventoryEntry.Descriptions }
     * 
     */
    public Inventory.InventoryEntries.InventoryEntry.Descriptions createInventoryInventoryEntriesInventoryEntryDescriptions() {
        return new Inventory.InventoryEntries.InventoryEntry.Descriptions();
    }

    /**
     * Create an instance of {@link Inventory.VersionInfo }
     * 
     */
    public Inventory.VersionInfo createInventoryVersionInfo() {
        return new Inventory.VersionInfo();
    }

    /**
     * Create an instance of {@link Inventory.InventoryEntries.InventoryEntry.InventoryNames }
     * 
     */
    public Inventory.InventoryEntries.InventoryEntry.InventoryNames createInventoryInventoryEntriesInventoryEntryInventoryNames() {
        return new Inventory.InventoryEntries.InventoryEntry.InventoryNames();
    }

    /**
     * Create an instance of {@link Inventory.InventoryEntries.InventoryEntry.Descriptions.Description }
     * 
     */
    public Inventory.InventoryEntries.InventoryEntry.Descriptions.Description createInventoryInventoryEntriesInventoryEntryDescriptionsDescription() {
        return new Inventory.InventoryEntries.InventoryEntry.Descriptions.Description();
    }

}
