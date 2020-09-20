package AnimalRescuer;

public class petfood {


    private String name ;
    private int price ;
    private int quantity;
    private String instock;

    public String getName() {
        return name;
    }

    public void setName(String nameofpetfood) {
        name = nameofpetfood;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price=price;
    }

    public int getQuantity() {
        return quantity;
    }
        public void setQuantity(int quantity) {
            this.quantity=quantity;
        }

        public String getInstock(){
            return instock;
        }
        public void setInstock (String valueofstock) {
            instock= valueofstock;
        }

    }



