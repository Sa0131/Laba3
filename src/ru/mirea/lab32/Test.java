package ru.mirea.lab32;

import java.util.Random;

public class Test {
    public static int[] numbers;

    public static void main(String[] args)
    {
        System.out.println("Генерирую случайную последовательность...");

        GenerateRandomNumbers();

        for(int counter = 0; counter < numbers.length; counter++ )
        {
            System.out.print(numbers[counter] + " ");
        }

        System.out.println("\nПроверяю, является ли последовательностью: " + IsSequence());
    }

    private static void GenerateRandomNumbers()
    {
        numbers = new int[4];

        for(int counter = 0; counter < numbers.length; counter++ )
        {
            numbers[counter] = (new Random()).nextInt(10,99);
        }
    }

    private static boolean IsSequence()
    {
        int tempPreviousNumber = numbers[0];
        for(int counter = 1; counter < numbers.length; counter++ )
        {
            if(tempPreviousNumber > numbers[counter])
                return false;
            tempPreviousNumber = numbers[counter];
        }
        return true;
    }
}
