/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Jeffrey
 */
public class ShoppingBasket {
    private Map<String, Purchase> purchases;
    
    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        if (!purchases.containsKey(product)) {
            purchases.put(product, new Purchase(product, 1, price));
            return;
        }
        for (String prod : purchases.keySet()) {
            if (prod.equals(product)) {
                purchases.get(prod).increaseAmount();
            }
        }
    }
    
    public int price() {
        int total = 0;
        for (String purchase : purchases.keySet()) {
            total += purchases.get(purchase).price();
        }
        return total;
    }
    
    public void print() {
        for (String purchase : purchases.keySet()) {
            System.out.println(purchases.get(purchase));
        }
    }
}
