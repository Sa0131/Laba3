package ru.mirea.lab.o2;

import java.util.Scanner;

public class Main {
    private static Tovar[] tovars = new Tovar[3];

    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in );

        tovars[0] = new Tovar(1,500 ,"Яблоко");
        tovars[1] = new Tovar(2,600,"Персик");
        tovars[2] = new Tovar(3,999,"Банан");

        for (Tovar tovar : tovars)
        {
            System.out.println(String.format("Товар №%s %s: %s %s", tovar.GetId(), tovar.GetName(), tovar.ShowInCurrency(Currencies.Ruble), Currencies.Ruble.toString()));
        }

        System.out.print("\nДоступные валюты: ");

        for(Currencies currency : Currencies.values())
        {
            System.out.print(String.format("%s ",currency.toString()));
        }

        System.out.println("\n\n");

        boolean correctCurency = false;
        Currencies selectedCurrency = Currencies.Ruble;
        String readedLine;

        do
        {
            System.out.print("\nНапишите валюту: ");
            readedLine = scanner.nextLine();

            for(Currencies currency : Currencies.values())
            {
                if(currency.toString().equals(readedLine)) {
                    selectedCurrency = currency;
                    correctCurency = true;
                }
            }
        }
        while(correctCurency == false);

        for(Tovar tovar : tovars)
        {
            System.out.println(String.format("Товар №%s %s: %s %s",tovar.GetId(), tovar.GetName(), tovar.ShowInCurrency(selectedCurrency), selectedCurrency.toString()));
        }
    }
}

