package ru.netilogy.stats;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.calculateSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.findMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateBelowAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.calculateBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAboveAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.calculateAboveAverage(sales);
        assertEquals(expected, actual);
    }

}