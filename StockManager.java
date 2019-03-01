import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        boolean match;
        Product testing = item;
        for(Product checking : stock){
            if(testing.getID() = checking.getID()) {
                match = true;
            }else {
                match = false;
            }
        }
        
        if(match = false) {
            stock.add(item);
        }else {
            System.out.println("Sorry, the product ID you entered already exists. Please enter a new one.");
        }
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        if(findProduct(id) != null) {
            findProduct(id).increaseQuantity(amount);
        }else {
            System.out.println("That item ID cannot be found.");
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product checking : stock) {
            if(checking.getID() == id) {
                return checking;
            }
        }
        return null;
    }
    
    /**
     * Find a product using only its name and return that products details.
     * @return The identified product, or null if thre is none with a matching name.
     */
    public Product findProduct(String name) {
        for(Product checking : stock) {
            if(name.equals(checking.getName())){
                return checking;
            }
        }
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        if(findProduct(id) != null) {
            return findProduct(id).getQuantity();
        }else {
        return 0;
    }
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        for(Product detail : stock) {
            System.out.println(detail.toString());
        }
    }
    
    /**
     * Prints details of all products with stock level below given value.
     */
    public void printCertainLevels(int level) {
        
        for(Product detail : stock) {
            if(detail.getQuantity() < level) {
                System.out.println(detail.toString());
        }
    }
}
}
