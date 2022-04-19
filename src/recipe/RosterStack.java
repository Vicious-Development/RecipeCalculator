package recipe;

import items.Item;
import items.ItemStack;

public class RosterStack extends ItemStack {
    public RosterStack(Item i) {
        super(i);
    }

    public RosterStack(Item i, int s) {
        super(i, s);
    }
    public RosterStack(Item i, int s, int layer) {
        super(i, s);
        this.layer=layer;
    }
    public int layer;
}
