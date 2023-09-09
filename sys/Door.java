package sys;

public class Door {

    public final static String OPEN="门己开启";
    public final static String CLOSE="门已关闭";
    private String state = CLOSE;
    public Door (){this.setState(CLOSE);}
    public void open() {this.setState(OPEN);}
    public void close() {this.setState(CLOSE);}
    public String getState() {return this.state;}
    public void setState(String state){this.state = state;}

}