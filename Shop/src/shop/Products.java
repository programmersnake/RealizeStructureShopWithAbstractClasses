package shop;

public abstract class Products{

   
    public abstract String getCode();
    public abstract int getCost();
    public abstract String getName();
}
class UkraineBread extends Products{
    
    private final String code = "AA01";
    private final int cost = 10;
    private final String name = "Украинский Хлеб";
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
    
}

class ItalicPastaBarilla extends Products{
    
    private final String code = "AA02";
    private final int cost = 30;
    private final String name = "Макароны Barilla №83 Tortiglioni";
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
    
}

class CheessGradPadano extends Products{
    
    private final String code = "AA03";
    private final int cost = 42;
    private final String name = "Сыр Grana Padano DOP 14 Мес";
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
    
}

class CoffeeKlimboAromaItaliano extends Products{
    
    private final String code = "AA04";
    private final int cost = 100;
    private final String name = "Кофе Kimbo Aroma Italiano";
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
    
}

class CoffeeLavazzaQualitaOro extends Products{
    
    private final String code = "AA05";
    private final int cost = 139;
    private final String name = "Кофе Lavazza Qualita Oro (Молотый)";
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
    
}

class CandyFerreroRocherCollection extends Products{
    
    private final String code = "AA06";
    private final int cost = 225;
    private final String name = "Конфеты Ferrero Rocher Collection (T15x6 - 150)";
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
    
}

class ChocolateTobleroneBlack extends Products{
    
    private final String code = "AA07";
    private final int cost = 62;
    private final String name = "Шоколад Toblerone Черный";
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
    
}

class TeaWestminsterOstriesischeTeemischung extends Products{
    
    private final String code = "AA08";
    private final int cost = 92;
    private final String name = "Чай Westminster Ostriesische Teemischung";
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
    
}

class SausageSalymi extends Products{
    
    private final String code = "AA09";
    private final int cost = 47;
    private final String name = "Салями Chirizo Special Carchelejo";
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
    
}

class Musli_Crynchy extends Products{
    
    private final String code = "AA10";
    private final int cost = 63;
    private final String name = "Мюсли-Кранчи Crownfield С Малиной";
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
    
}