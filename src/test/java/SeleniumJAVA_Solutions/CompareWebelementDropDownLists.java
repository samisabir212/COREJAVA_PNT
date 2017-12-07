/*
package SeleniumJAVA_Solutions;

import com.sun.org.apache.bcel.internal.generic.Select;

public class CompareWebelementDropDownLists {
*/

/*



    private WebDriver d;



    @Test
    public void testUntitled() throws Exception {
        d = new FirefoxDriver();
        d.get("http://register.rediff.com/commonreg/index.php?redr=http://portfolio.rediff.com/money/jsp/loginnew.jsp?redr=home");

        int count = 0;
        String[] exp = {"Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        WebElement dropdown = d.findElement(By.id("date_mon"));
        Select select = new Select(dropdown);

        List<WebElement> options = select.getOptions();
        for (WebElement we : options) {
            for (int i = 0; i < exp.length; i++) {
                if (we.getText().equals(exp[i])) {
                    count++;
                }
            }
        }
        if (count == exp.length) {
            System.out.println("matched");
        } else {
            System.out.println("Houston, we have a problem.");
        }
    }
}
*/
