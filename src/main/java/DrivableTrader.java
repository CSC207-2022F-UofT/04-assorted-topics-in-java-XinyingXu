/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;
class DrivableTrader extends Trader<Drivable> {
    public DrivableTrader(List<Drivable> inventory,
                                List<Drivable>
                                        wishlist,
                                int money) {
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int money) {
        super(money);
    }

    @Override
    public int getSellingPrice(Drivable ob) {
        if (ob instanceof Tradable) {
            int super_price = super.getSellingPrice(ob);
            int max_speed = ob.getMaxSpeed();
            return super_price+max_speed;
        }
        else {return Tradable.MISSING_PRICE;}
    }

}