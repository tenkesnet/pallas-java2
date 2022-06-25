
public class User {
    public long id;
    public String name;
    public String username;
    public String email;
    public Address address;
    public String phone;
    public String website;
    public Company company;

    @Override
    public String toString() {

        return "User [address=" + address.city + ", company=" + company.name
                + "; lat:" + address.geo.lat + ", lng" + address.geo.lng + ", email=" + email;
        /*
         * + ", id=" + id
         * + ", name="
         * + name + ", phone=" + phone + ", username=" + username + ", website=" +
         * website + "]\n";
         */

    }

    interface HelloWorld {
        public void greet();

        public void greetSomeone(String someone);
    }

    HelloWorld frenchGreeting = new HelloWorld() {
        String name = "tout le monde";

        public void greet() {
            greetSomeone("tout le monde");
        }

        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Salut " + name);
        }
    };
}
