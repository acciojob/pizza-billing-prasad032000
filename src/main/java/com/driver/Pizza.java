package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int extraToppings;
    int basePrice;
    int extraCheese=80;
    String ans="";
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            ans+="Base Price Of The Pizza: "+300+"\n";
            price+=300;
            extraToppings=70;
        }else{
            ans+="Base Price Of The Pizza: "+400+"\n";
            price+=400;
            extraToppings=120;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        price+=extraCheese;
        ans+="Extra Cheese Added: "+extraCheese+"\n";
    }

    public void addExtraToppings(){
        price+=extraToppings;
        ans+="Extra Toppings Added: "+extraToppings+"\n";
    }

    boolean isPaperBagAdded=false;
    public void addTakeaway(){
        if(!isPaperBagAdded){
            price+=20;
            isPaperBagAdded=true;
            ans+="Paperbag Added: 20"+"\n";
        }

    }

    public String getBill(){
        ans+="Total Price: "+price+"\n";
        return this.ans;
    }
    public void setPrice(int val){
        this.price=val;
    }
}
