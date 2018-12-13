
package shop;

import java.util.List;

class Salesman extends Person{
    
    private int sum=0;
    public Salesman(String name){
        super(name);
    }
    
    int CheckProduct(List ProductsName, List ProductsCode, List ProductsCost){
        List g = ProductsCost.subList(0, ProductsCost.size());
        for(int i=0;i<g.size();i++)
            sum=sum+(int) g.get(i);    
        if(Shop.client.paykkk(sum)==-1){
            System.out.println("У вас мало денег!");
            System.exit(0);
        }
        CreateCheck(Shop.client.paykkk(sum));
        return 0;
    }
    
    void CreateCheck(int ClientPay){
        System.out.println("");
        System.out.println("Чек");
        System.out.println(Shop.client.ShowProductsCode());
        System.out.println("-----------------------------------");
        System.out.println("СУМА                        "+sum);
        System.out.println("- - - - - - - - - - - - - - - - - -");
        System.out.println("ПДВ А    20,00%             "+(sum*0.2));
        System.out.println("- - - - - - - - - - - - - - - - - -");
        System.out.println("К оплате                    "+sum);  
        System.out.println("Наличка                     "+ClientPay);
        System.out.println("Сдача                       "+GiveChange(ClientPay));
        System.out.println("         Спасибо за покупку!");
        System.out.println("          Фискальный ЧЕК");
        
    }
    
    int GiveChange(int ClientPay){
        return ClientPay-sum;
    }

}