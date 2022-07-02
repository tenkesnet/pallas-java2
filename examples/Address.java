package examples;

public class Address {
    public String street;
    public String city;
    public String suite;
    public String zipcode;
    public Geo geo;

    public Address() {

    }

    public Address(String street, String city, String suite, String zipcode, Geo geo) {
        this.street = street;
        this.city = city;
        this.suite = suite;
        this.zipcode = zipcode;
        this.geo = geo;
    }
}
