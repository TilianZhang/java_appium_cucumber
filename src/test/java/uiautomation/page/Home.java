package uiautomation.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class Home extends Base {


    @FindBy(id="element_id")
    private WebElement elementExample;

    @FindBy(css = "element_css")
    private WebElement elementExample2;

    

    public void action(){
        //do sth
    }



}