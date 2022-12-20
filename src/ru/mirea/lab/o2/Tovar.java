package ru.mirea.lab.o2;

public class Tovar {
    private int Id = 0;
    private String name = "no name";
    private Currency currency = new Currency(Currencies.Ruble, 500);

    Tovar(int id,int price, String name)
    {
        currency.SetCurrencyValue(price);
        this.Id = id;
        this.name = name;
    }

    public int ShowInCurrency(Currencies needCurrency)
    {
        if(needCurrency == Currencies.Dollar)
            return (int)((float)currency.GetCurrencyValue() * 0.016662f);

        if(needCurrency == Currencies.Euro)
            return (int)((float)currency.GetCurrencyValue() * 0.019653f);

        return currency.GetCurrencyValue();
    }

    public String GetName()
    {
        return name;
    }

    public int GetId()
    {
        return Id;
    }
}
