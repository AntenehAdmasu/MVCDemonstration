public class ProductModel {
        private String name;
        private int amount;
        private double price;
        private String serialNumber;

        public ProductModel(String name, int amount, double price, String serialNumber) {
                this.name = name;
                this.amount = amount;
                this.price = price;
                this.serialNumber = serialNumber;
        }
        //Getters
        public String getName() {
                return name;
        }

        public int getAmount() {
                return amount;
        }

        public double getPrice() {
                return price;
        }

        public String getSerialNumber() {
                return serialNumber;
        }
        //Setters
        public void setName(String name) {
                this.name = name;
        }

        public void setAmount(int amount) {
                this.amount = amount;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public void setSerialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
        }
}
