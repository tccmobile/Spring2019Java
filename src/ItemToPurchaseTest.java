import junit.framework.Assert;
import junit.framework.TestCase;

public class ItemToPurchaseTest extends TestCase {

    ItemToPurchase test = new ItemToPurchase();

    public void testSetName() {
        test.setName("Bob");
        Assert.assertEquals("Bob",test.getName());

    }

    public void testSetPrice() {
        test.setPrice(42);
        Assert.assertEquals(42,test.getPrice());
    }

    public void testSetQuantity() {
        test.setQuantity(17);
        Assert.assertEquals(17,test.getQuantity());
    }
}