package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Map;

@Controller
public class VatController {

    private final Vat vat;

    public VatController(Vat vat) {
        this.vat = vat;
    }

    @Get("/vat")
    public Map<String, BigDecimal> index() {
        return Collections.singletonMap("rate", vat.getRate());
    }
}