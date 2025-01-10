package example.micronaut;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
//@Property(name = "vat.country", value = "Switzerland")
//@Property(name = "vat.rate", value = "7.7")
public class VatControllerTest {
    @Test
    void vatExposesTheValueAddedTaxRate(@Client("/") HttpClient httpClient) {
        assertEquals("{\"rate\":7.7}", httpClient.toBlocking().retrieve("/vat"));
    }
}
