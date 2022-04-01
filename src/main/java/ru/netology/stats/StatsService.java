package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int value : sales) {
            sum += value;
        }
        return sum;
    }

    // Среднее значение продаж по месяцам
    public int calculateAverage(int[] sales) {
        int sum = this.calculateSum(sales);
        return sum / sales.length;
    }

    // Пик продаж
    public int findMax(int[] sales) {
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        maxMonth += 1;
        return maxMonth;
    }

    // Минимум продаж
    public int findMin(int[] sales) {
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }
        minMonth += 1;
        return minMonth;
    }

    // Продажи ниже среднего
    public int calculateBelowAverage(int[] sales) {
        int counter = 0;
        int average = calculateAverage(sales);
        for (int sale : sales) {
            if (sale < average) {
                counter += 1;

            }
        }
        return counter;
    }

    // Продажи выше среднего

    public int calculateAboveAverage(int[] sales) {
        int counter = 0;
        int average = calculateAverage(sales);
        for (int sale : sales) {
            if (sale > average) {
                counter += 1;

            }
        }
        return counter;
    }
}