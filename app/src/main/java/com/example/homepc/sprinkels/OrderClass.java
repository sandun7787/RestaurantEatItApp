package com.example.homepc.sprinkels;


public class OrderClass {
    private String Itemid;
    private String Itemname;
    private String Itemquantity;
    public String Itemprice;

    public OrderClass(String iId, String iName, String iQuantity,String iPrice)
    {
        Itemid = iId;
        Itemname = iName;
        Itemquantity = iQuantity;
        Itemprice = iPrice;

    }


    public String getItemId() {
        return Itemid;
    }

    public String getItemName() {
        return Itemname;
    }

    public String getItemPrice() {return Itemprice;}

    public String getItemquantity() {return Itemquantity;}


}
