package sys;

public class Door {

    private boolean state = false; // 门的状态

    public boolean getState(){
        return this.state;
    }

    public void setState(boolean state){
        this.state = state;
    }

    public boolean open() {
        System.out.println("门已打开");
        this.state = true;
        return true;
    }

    public void close() {
        System.out.println("门已关闭");
        this.state = false;
    }


}