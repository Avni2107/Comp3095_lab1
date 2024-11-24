package ca.gbc.inventoryservice.service;

public interface InventoryService {

    public boolean isInStock(String rskCode, int quantity);

    boolean isInStock(String skuCode, Integer quantity);
}
