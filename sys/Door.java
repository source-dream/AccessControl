package sys;

public class Door {

    private boolean state = false; // 门的状态

    public void open() {
        System.out.println("门已打开");
        this.state = true;
    }

    public void close() {
        System.out.println("门已关闭");
        this.state = false;
    }

    public boolean getState() {
        return this.state;
    }

}