package Base;

public class BaseException extends Exception {

    private static final long serialVersionUID = 1L;
    private String error;

    public BaseException(String Error) {
        super();
        this.error = Error;
    }

    public String toString(){
        return this.error;
    }

}
