package uiautomation.page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uiautomation.page.Base;


@Component
public class ButtomNav extends Base {


    @FindBy(id="element_id")
    private WebElement elementExample;

    @FindBy(css = "element_css")
    private WebElement elementExample2;

    @Autowired
    protected ButtomNav buttomNav;


    public void action(){
        //do sth
    }



}