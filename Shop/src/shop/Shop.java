package shop;

import java.util.List;
import java.util.Scanner;
import shop.Products;

public class Shop {

    public static Buyer client = new Buyer("Steve",500);
    
    public static void main(String[] args) {
        startShopping();

    }
    
    static void startShopping(){        
        System.out.println("Вы Steve, у вас 500 грн");
        System.out.println("Выберите товар:");
        final String[] ProductsNames = 
        {
            "Украинский Хлеб - 10 грн",
            "Макароны Barilla №83 Tortiglioni - 30 грн",
            "Сыр Grana Padano DOP 14 Мес - 42 грн",
            "Кофе Kimbo Aroma Italiano - 100 грн",
            "Кофе Lavazza Qualita Oro (Молотый) - 139 грн",
            "Конфеты Ferrero Rocher Collection (T15x6 - 150) - 225 грн",
            "Шоколад Toblerone Черный - 62 грн",
            "Чай Westminster Ostriesische Teemischung - 92 грн",
            "Салями Chirizo Special Carchelejo - 47 грн",
            "Мюсли-Кранчи Crownfield С Малиной - 63 грн"
        };
        for(int i = 0; i<10;i++)
            System.out.println((i+1)+") "+ProductsNames[i]);
        System.out.println("Когда все - '0'");
        boolean continuebye=true;
        while(continuebye){
            Scanner scan = new Scanner(System.in);
            int numberProduct=scan.nextShort();
            switch(numberProduct){
                case 0:{                    
                    client.ShowProductsName();
                    continuebye=false;
                    break;
                }
                case 1:{
                    Products pr = new UkraineBread();
                    client.addProduct(pr);
                    break;
                }
                case 2:{
                    Products pr = new ItalicPastaBarilla();
                    client.addProduct(pr);
                    break;
                }
                case 3:{
                    Products pr = new CheessGradPadano();
                    client.addProduct(pr);
                    break;
                }
                case 4:{
                    Products pr = new CoffeeKlimboAromaItaliano();
                    client.addProduct(pr);
                    break;
                }
                case 5:{
                    Products pr = new CoffeeLavazzaQualitaOro();
                    client.addProduct(pr);
                    break;
                }
                case 6:{
                    Products pr = new CandyFerreroRocherCollection();
                    client.addProduct(pr);
                    break;
                }
                case 7:{
                    Products pr = new ChocolateTobleroneBlack();
                    client.addProduct(pr);
                    break;
                }
                case 8:{
                    Products pr = new TeaWestminsterOstriesischeTeemischung();
                    client.addProduct(pr);
                    break;
                }
                case 9:{
                    Products pr = new SausageSalymi();
                    client.addProduct(pr);
                    break;
                }
                case 10:{
                    Products pr = new Musli_Crynchy();
                    client.addProduct(pr);
                    break;
                }
            }
        }
        ContinueShopping();
    }
    
    static void ContinueShopping(){
        boolean restart = true;        
        while(restart){
            System.out.println("Вы согласны со список покупок?(true/false)");
            boolean tf=true;
            Scanner scan = new Scanner(System.in);
            tf=scan.nextBoolean();
            if(tf){                
                break;                
            }
            else{
                System.out.println("Введите номер товара, который хотите вернуть на полку");
                int n = scan.nextInt();
                client.deleteProduct(n-1);
                client.ShowProductsName();
                continue;
            }
        }
        client.goToCashier();
    }
}