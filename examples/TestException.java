package examples;

public class TestException extends Exception {

    public TestException() {
        super();
    }

    public TestException(String errormessage) {
        super(errormessage);
    }

    public TestException(String emessage, Throwable err) {
        super(emessage, err);
    }
}
