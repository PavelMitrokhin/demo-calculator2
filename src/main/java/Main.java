import byITAcademyMPAcalculator2.Calculator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.sum(2.33, 4.28));

        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.onliner.by/");
    }
}
