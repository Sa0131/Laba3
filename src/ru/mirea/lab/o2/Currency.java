package ru.mirea.lab.o2;

public class Currency {
    private Currencies type = Currencies.Ruble;
    private int value = 0;

    Currency(Currencies currencies, int value)
    {
        this.type = currencies;
        this.value = value;
    }

    public Currencies GetCurrencyType() {
        return type;
    }

    public int GetCurrencyValue() {
        return value;
    }

    public void SetCurrencyValue(int price)
    {
        this.value = price;
    }
}
