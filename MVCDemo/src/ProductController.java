public class ProductController {
    private ProductModel model;
    private ProductView view;

    public ProductController(ProductModel model, ProductView view){
        this.model = model;
        this.view = view;
    }

    public void setProductName(String name){
        model.setName(name);
    }

    public String getProductName(){
        return model.getName();
    }

    public void setProductAmountName(int amount){
        model.setAmount(amount);
    }

    public int getProductAmount(){
        return model.getAmount();
    }

    public void setProductPrice(double price){
        model.setPrice(price);
    }

    public double getProductPrice(){
        return model.getPrice();
    }

    public void setProductSerialNumber(String serialNumber){
        model.setName(serialNumber);
    }

    public String getProductSerialNumber(){
        return model.getSerialNumber();
    }
    public void updateView(){
        view.printProductDetails(model.getName(), model.getAmount(), model.getPrice(), model.getSerialNumber());
    }
}
