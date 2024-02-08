package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        if(isVeg){
            int ans=300+80+70;
            setPrice(ans);
        }else{
            int ans=400+80+120;
            setPrice(ans);
        }
    }
    @Override
    public void addExtraCheese(){
        ans+="Extra Cheese Added: "+extraCheese+"\n";
    }
   @Override
    public void addExtraToppings(){
        ans+="Extra Toppings Added: "+extraToppings+"\n";
    }

}
