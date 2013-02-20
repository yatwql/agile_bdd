package agile.demo.concordion;

import org.concordion.integration.junit3.ConcordionTestCase;

import agile.demo.concordion.Greeter;

public class HelloWorldTest extends ConcordionTestCase {
    
    public String greetingFor(String firstName) {
        return new Greeter().greetingFor(firstName);
    }
}
