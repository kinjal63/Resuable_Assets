package hackerrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
	Map<String, Float> furnitureItemMap;
	Map<Furniture, Integer> furnitureCountMap;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
    	furnitureItemMap = Collections.synchronizedMap(new HashMap<String, Float>());
    	furnitureCountMap = Collections.synchronizedMap(new HashMap<Furniture, Integer>());
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        float costPerItem = type.cost();
        String label = type.label();
        
        Float furnitureCost = Float.valueOf(costPerItem * furnitureCount);
        int furnitureQuantity = 1;
        
        if(furnitureItemMap.containsKey(label)) {
        	furnitureCost =+ furnitureItemMap.get(label);
        }
        if(furnitureCountMap.containsKey(type)) {
        	furnitureQuantity =+ furnitureCountMap.get(type);
        }
        
        furnitureItemMap.put(label, furnitureCost);
        furnitureCountMap.put(type, furnitureQuantity);
    }

    public Map<Furniture, Integer> getOrderedFurniture() {
        return furnitureCountMap;
    }

    public float getTotalOrderCost() {
    	float totalCost = 0;
    	for(String item : furnitureItemMap.keySet()) {
    		totalCost += furnitureItemMap.get(item);
    	}
        return totalCost;
    }

    public int getTypeCount(Furniture type) {
        return furnitureCountMap.get(type);
    }

    public float getTypeCost(Furniture type) {
        return furnitureItemMap.get(type.label());
    }

    public int getTotalOrderQuantity() {
    	int totalOrder = 0;
    	
    	for(Furniture type : furnitureCountMap.keySet()) {
    		totalOrder += furnitureCountMap.get(type);
    	}
        return totalOrder;
    }
}
