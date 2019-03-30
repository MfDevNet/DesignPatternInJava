package designpattern.structural.Strategy.shop;

public class ShopingCart {

    public int amount=0;
     PayStrategy payStrategy;

    public ShopingCart(int amount){
        this.amount=amount;
    }

    public void setAmount(int amount){
        this.amount=amount;
    }

    public int getAmount(){
        return this.amount;
    }

    public void payAmount(){
        if (this.amount>=1000000){
            payStrategy=new PayByMellat();
        }
        else if (this.amount>=500000){
            payStrategy = new PayByCC();
            }
        else{
            payStrategy=new PayByPayPal();
        }
        System.out.println(payStrategy.pay(amount));
    }
}
