package pl.kozubek.webapi.tacos;


import lombok.Data;

import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Order {

    @NotBlank(message = "Podanie imienia i nazwiska jest obowiązakowe.")
    private String name;

    @NotBlank(message = "Podanie ulicy jest obowiązakowe.")
    private String street;

    @NotBlank(message = "Podanie miejscowości jest obowiązakowe.")
    private String city;

    @NotBlank(message = "Podanie województwa jest obowiązakowe.")
    private String state;

    @NotBlank(message = "Podanie kodu pocztowego jest obowiązakowe.")
    private String zip;

    @CreditCardNumber(message = "To nie jest poprawny numer karty kredytowej")
    private String ccNumber;

    @Pattern(regexp = "^(0[1-9]1[0-2])([\\/])([1-9][0-9])$", message = "Wartość musi być w formacie MM/RR")
    private String ccExpiration;

    @Digits(integer = 3, fraction = 0, message = "Nieprawidłowy kod CVV")
    private String ccCVV;

    public Order() {
    }

    public Order(String name, String street, String city, String state, String zip, String ccNumber, String ccExpiration, String ccCVV) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.ccNumber = ccNumber;
        this.ccExpiration = ccExpiration;
        this.ccCVV = ccCVV;
    }
}
