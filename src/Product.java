public class Product {
    private String name;
    private float value;
    private int amount;

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    Product(String name, float value, int amount) {
        setName(name);
        setValue(value);
        setAmount(amount);
    }

    public float calcBuy() {
        float total = value * amount;

        if(amount > 10 && amount <= 20) {
            // 10% de desconto
            float discount = total * 10 / 100 ;
            total -= discount;

            return total;
        }

        if(amount > 20 && amount <= 50) {
            //  20% de desconto
            float discount = total * 20 / 100 ;
            total -= discount;

            return total;
        }

        if(amount > 50) {
            // 25% de desconto
            float discount = total * 25 / 100 ;
            total -= discount;

            return total;
        }

        return total;
    }
}
