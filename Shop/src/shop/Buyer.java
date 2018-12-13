package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Buyer extends Person{
    
    private List ProductsName = new ArrayList<String>();
    private List ProductsCode = new ArrayList<String>();
    private List ProductsCost = new ArrayList<Integer>();
    private int Moneys;
    
    Buyer (String name, int Moneys){
        super(name);
        this.Moneys=Moneys;
    }
    
    void addProduct(Products product){
        ProductsName.add(product.getName());
        ProductsCode.add(product.getCode());
        ProductsCost.add(product.getCost());
    }
    void deleteProduct(int i){
        if((ProductsName.size()>i)&&(ProductsCode.size()>i)&&(ProductsCost.size()>i)){
            ProductsName.remove(i);
            ProductsCode.remove(i);
            ProductsCost.remove(i);
        }
            
    }
    public void goToCashier(){
        Salesman salesMan = new Salesman("Bob");
        salesMan.CheckProduct(ProductsName, ProductsCode, ProductsCost);
    }
    
    int paykkk(int cost){
        if((cost>0)&&(cost<=10))
            return 10;
        else if((cost>10)&&(cost<=20))
            return 20;
        else if((cost>20)&&(cost<=50))
            return 50;
        else if((cost>50)&&(cost<=100))
            return 100;
        else if((cost>100)&&(cost<=150))
            return 150;
        else if((cost>150)&&(cost<=200))
            return 200;
        else if((cost>200)&&(cost<=250))
            return 250;
        else if((cost>250)&&(cost<=300))
            return 300;
        else if((cost>300)&&(cost<=400))
            return 400;
        else if((cost>400)&&(cost<=500))
            return 500;
        else
            return -1;
    }
    
    List ShowProductsName(){
        System.out.println("Список:");
        for(int i = 0; i<ProductsName.size();i++){
            System.out.println((i+1)+") "+ProductsName.get(i)+"   - цена: "+ProductsCost.get(i));
        }
        return ProductsName;
    }
    List ShowProductsCode(){
        for(int i = 0; i<ProductsCode.size();i++){
            System.out.println((i+1)+") "+ProductsCode.get(i));
            System.out.println(ProductsName.get(i)+"   - цена: "+ProductsCost.get(i));
            
        }
        return ProductsCode;
    }
    List ShowProductsCost(){
        for(int i = 0; i<ProductsCost.size();i++){
            System.out.println((i+1)+") "+ProductsCost.get(i));
        }
        return ProductsCost;
    }        
    
}
