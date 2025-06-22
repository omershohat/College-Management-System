package Omer_Ran;

import java.util.ArrayList;

public class Utils {

    public static Nameable findObject(ArrayList<? extends Nameable> arrayList, Nameable item) {
        // searching in Nameable list for a Nameable with the same name item
        String itemName = item.getName();
        for (Nameable na : arrayList) {
            if (na.getName().equals(itemName)) {        // if found - return that Nameable
                return na;
            }
        }
        return null;        // else - return null
    }
}
