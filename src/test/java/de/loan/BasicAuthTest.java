package de.loan;

import org.junit.Test;

import de.loan.core.SelTestCase;


/**
 * Tests Basic Auth
 *
 */
public class BasicAuthTest extends SelTestCase {

    @Test 
    public void shouldLoginUsingBasicAuthCredentials() {
        getWebDriver().get(
            "https://ostdteam:ostdteam@test.scorecompass.ostdlabs.com/");
    }
}
