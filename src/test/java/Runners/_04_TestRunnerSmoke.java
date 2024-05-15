package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // bütün senaryolarda SmokeTest tag ine sahip olanları çalıştır
        features = {"src/test/java/FeatureFiles"}, //klasördeki bütün feature lar
        glue = {"StepDefinitions"},
        plugin = {"json:target/site/cucumber.json"} //jenkinste report olusması icin JSON formatinda sonucu almasi lazim
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}