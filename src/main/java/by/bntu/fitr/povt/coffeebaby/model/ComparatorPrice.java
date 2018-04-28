package by.bntu.fitr.povt.coffeebaby.model;

import java.util.Comparator;

public class ComparatorPrice implements Comparator<Stone> {

    public int compare(Stone stone1, Stone stone2) {
        Double price1 = stone1.getPrice();
        Double price2 = stone2.getPrice();
        return price1.compareTo(price2);
    }
}

