package ru.netology.stats;

public class StatsService {
    public long calculateSales(long[] sales) {//= {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sum = 0;
    for(long sale :sales) {
        sum+=sale;
    }
        return sum;
}
    public long averageSale(long[] sales){
        long countsale =0;
        long sum = calculateSales(sales);
        for (long sale :sales ) {
            countsale += 1;
        }
        return sum / countsale;
    }
    public long findMax(long[] sales) {
        long currentMax = sales[0];
        long monthNumber = 0;
        long resultMonth = 0;
        for (long sale : sales) {
            monthNumber += 1;
            if (currentMax <= sale) {
                currentMax = sale;
                resultMonth = monthNumber;
            }
        }
        return resultMonth;
    }

    public long findMin(long[] sales) {
        long currentMin = sales[0];
        long monthNumber = 0;
        long resultMonth = 0;
        for (long sale : sales) {
            monthNumber += 1;
            if (currentMin >= sale) {
                currentMin = sale;
                resultMonth = monthNumber;
            }
        }
        return resultMonth;
    }

    public long calculateBelowAverage(long[] sales) {
        long resultMonths = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                resultMonths += 1;
            }
        }
        return resultMonths;
    }

    public long calculateAboveAverage(long[] sales) {
        long resultMonths = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                resultMonths += 1;
            }
        }
        return resultMonths;
    }
}
