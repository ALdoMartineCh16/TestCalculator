package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Usuario\\Documents\\Ingenieria_de_Sotfware_II\\Laboratorio_05\\geckodriver.exe");

    }
    @After
    public void tearDown() {

    }
    @Test
    public void TestPositive(){
        String firstValue = "10";
        String secondValue = "60";

        String expectedResult = "6"; // Valor esperado

        String result = Main.calculate(firstValue, secondValue);
        assertEquals(result, expectedResult);
    }


    @Test
    public void TestNegative(){
        String firstValue = "10";
        String secondValue = "-50";

        String expectedResult = "-5"; // Valor esperado

        String result = Main.calculate(firstValue, secondValue);
        assertEquals(result, expectedResult);
    }

    @Test
    public void TestA(){
        String firstValue = "5";
        String secondValue = "50";

        String expectedResult = "2.5"; // Valor esperado

        String result = Main.calculate(firstValue, secondValue);
        assertEquals(result, expectedResult);
    }
    @Test
    public void TestB(){
        String firstValue = "10";
        String secondValue = "100";
        String expectedResult = "20"; // Valor esperado

        String result = Main.calculate(firstValue, secondValue);
        assertEquals(result, expectedResult);
    }
}