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
        System.out.println("门禁系统的使用方法\n"+
            "1.模拟输入密码：以\"pass\"开头，后跟密码\n"+
            "2.模拟刷卡：以\"card\"开头，后跟卡号\n"+
            "3.模拟取指纹：以\"finger\"开头，后跟表示指纹的字符串\n"+
            "4.模拟管理员按下开门按钮：输入y");
            System.out.println("***************************************************");
            System.out.println("门禁系统启动");
    }
    public void work(){
        if (inPutEquip.getInput()!=null){
            if(inPutEquip.getInput().equals("exit")){
                System.out.println("门禁系统关闭");
                System.exit(0);}
            if(computer.validate(inPutEquip.getInput())){
                door.open();
                //开启电子
                System.out.println("身份验证成功");
                inPutEquip.setInput(null);
                //清空输入设备缓存
            }else{
                System.out.println("身份验证失败");
            }
                // if(this.getOpenSign()==true){
                // door.open();
                // System.out.println("管理员开启了电子门");
                // this.s (0);
            //电子/1开1门信号归零
        }
    }
    public void ring() {this.ring = true;}      
    public InputEquip getInputEquip(){return this.inPutEquip;}
    public boolean getRing(){return this.ring;}
    // public boolean getOpenSign(){return this.openSign;}
    // public boolean getOpenSign(){return this.openSign;}
}