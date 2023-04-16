/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oracle.model;

/**
 *
 * @author trilo
 */
public class CartModel {
    ProductModel productModel;
    int quantity;

    public CartModel() {
    }

    public CartModel(ProductModel productModel, int quantity) {
        this.productModel = productModel;
        this.quantity = quantity;
    }

    public ProductModel getProductModel() {
        return productModel;
    }

    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
