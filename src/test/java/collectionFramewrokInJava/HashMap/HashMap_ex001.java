package collectionFramewrokInJava.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.HashMap;

public class HashMap_ex001 {





    public static void main(String[] args) {


        HashMap<String, String> hashMap = new HashMap<String, String>();


        hashMap.put("sami", "God");

        System.out.println(hashMap.get("sami"));






    }
}
