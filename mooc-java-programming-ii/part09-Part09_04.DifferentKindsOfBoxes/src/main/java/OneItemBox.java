import java.util.*;
public class OneItemBox extends Box {
    private ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.items.size() == 0) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        boolean isIn = false;

        if (this.items.size() == 1) {
            Item existItem = this.items.get(0);
            isIn = existItem.equals(item);
        }

        return isIn;
    }
	
}
