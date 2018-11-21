package com.afrikanov.tests;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/resources" },
        glue = {"com.afrikanov.tests" })
public class SimpleTest {

    @BeforeClass
    public static void beforeAll(){
        Configuration.holdBrowserOpen = true;
    }

}

