/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
/**
 *
 * @author Jeffrey
 */
public class Storehouse {
    private Map<String, Integer> storehouse;
    private Map<String, Integer> storeStock;
    
    public Storehouse() {
        this.storehouse = new HashMap<String, Integer>();
        this.storeStock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        storehouse.put(product, price);
        storeStock.put(product, stock);
    }
    
    public int price(String product) {
        for (String prod : storehouse.keySet()) {
            if (product.equals(prod)) {
                return storehouse.get(prod);
            }
        }
        return -99;
    }
    
    public int stock(String product) {
        for (String prod : storeStock.keySet()) {
            if (prod.equals(product)) {
                return storeStock.get(prod);
            }
        }
        return 0;
    }
    
    public boolean take(String product) {
        for (String prod : storeStock.keySet()) {
            if (prod.equals(product)) {
                if (storeStock.get(prod) > 0) {
                    storeStock.put(prod, storeStock.get(prod) - 1);
                    return true;
                }
            }
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> products = storehouse.keySet();
        return products;
    }
}
