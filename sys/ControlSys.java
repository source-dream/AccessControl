/*
# -*-coding:utf-8 -*-
'''
@File    :   ControlSys.java
@Time    :   2023/09/09 19:05:03
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/

package sys;

public class ControlSys {
    private Door door;
    private Computer computer;
    private InputEquip inPutEquip;
    private boolean ring;
    private boolean openSign;
    
    public ControlSys(){
        this.door = new Door();
        this.computer = new Computer();
        this.inPutEquip = new InputEquip();
        this.ring = false;
        this.openSign = false;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("门禁系统的使用方法\n"+
            "1.模拟输入密码：以\"pass\"开头，后跟密码\n"+
            "2.模拟刷卡：以\"card\"开头，后跟卡号\n"+
            "3.模拟取指纹：以\"finger\"开头，后跟表示指纹的字符串\n"+
            "4.模拟管理员按下开门按钮：输入y\n"+
            "5.管理界面：输入admin");
            System.out.println("***************************************************");
            System.out.println("门禁系统启动");
    }
    public void work(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("门禁系统的使用方法\n"+
            "1.模拟输入密码：以\"pass\"开头，后跟密码\n"+
            "2.模拟刷卡：以\"card\"开头，后跟卡号\n"+
            "3.模拟取指纹：以\"finger\"开头，后跟表示指纹的字符串\n"+
            "4.模拟管理员按下开门按钮：输入y\n"+
            "5.管理界面：输入admin");
            System.out.println("***************************************************");
            System.out.println("门禁系统启动");
        if (inPutEquip.getInput()!=null){
            if(inPutEquip.getInput().equals("exit")){
                System.out.println("门禁系统关闭");
                System.exit(0);}
            if(inPutEquip.getInput().equals("admin")){
                Backgrand backgrand = new Backgrand();
                backgrand.run();
            }
            else if(computer.validate(inPutEquip.getInput())){
                door.open();
                //开启电子
                System.out.println("身份验证成功");
                door.open();  
                inPutEquip.setInput(null);
                System.out.println("电子门开启");
                //清空输入设备缓存
            }else{
                System.out.println("身份验证失败");
            }
        }
            
            /* 检查开门信号 */
            if(this.getOpenSign()==true){
                door.open();                        // 开启电子门
                System.out.println("管理员开启了电子门");
                this.setOpenSign(false);               // 电子门开门信号归零
            }

            /* 电子门开启状态将维持5秒后关闭 */
            if(door.getState().equals(Door.OPEN)){
                try {
                    Thread.sleep(5000);             // 让电子门开启状态维持5秒
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                door.close();                       // 关闭电子门
                System.out.println("电子门关闭");
            }
    }
    public void ring() {
        this.ring = true;
    }      
    public InputEquip getInputEquip(){
        return this.inPutEquip;
    }
    public boolean getRing(){
        return this.ring;
    }
    public void setRing(boolean ring) {
        this.ring = ring;
    }
    public Computer getComputer() {
        return computer;
    }
    public Door getDoor() {
        return door;
    }
    public boolean getOpenSign(){return this.openSign;}
    public void setOpenSign(boolean openSign) {
        this.openSign = openSign;
    }
}