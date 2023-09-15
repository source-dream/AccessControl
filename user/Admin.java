/*
# -*-coding:utf-8 -*-
@File    :   Admin.java
@Time    :   2023/09/09 19:06:47
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/


package user;
import sys.*;
import java.util.Scanner;
public class Admin extends Employee {

    public Admin() {
        super();
    }
    public Admin(String name) {
        super(name);
    }
    public void work(ControlSys controlSys) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("管理员(" + this.getName() + ")按开门按钮？[y/n]:");
        String btn = scanner.nextLine();
        if (btn.equals("y")) {
            controlSys.setOpenSign(true);
            System.out.print("管理员(" + this.getName() + ")按下开门按钮");
        } else if (btn.equals("exit")) {
            controlSys.getInputEquip().setInput("exit");
        } else {
        	System.out.print("管理员(" + this.getName() + ")拒绝开门");
        }
    }

    /**
     * 管理员的工作方法2，监控门铃
     * 
     * @param controlSys
     * @param guest
     */
    public void work(ControlSys controlSys, Guest guest) {
        if (controlSys.getRing() == true) {
        	System.out.print("访客(" + guest.getName() + ")在按门铃");
            this.work(controlSys);
            controlSys.setRing(false);
            System.out.print("管理员(" + this.getName() +")关闭门铃");
        }
    }

    /**
     * 管理员的工作方法3，录入验证信息
     * 
     * @param controlSys
     * @param valType
     * @param valStr
     */
    public void work(ControlSys controlSys, String valType, String valStr) {
        if (valType.equals("pa")) {
            // controlSys.getComputer().addPassWord(Integer.parseInt(valStr));
            System.out.print(
                    "管理员(" + this.getName() + ")录入新的密码验证信息");
        } else if (valType.equals("ca")) {
            controlSys.getComputer().addCard(valStr);
            System.out.print(
                    "管理员(" + this.getName() + ")录入新的胸卡验证信息");
        } else if (valType.equals("fi")) {
            controlSys.getComputer().addFingerMark(valStr);
            System.out.print(
                    "管理员(" + this.getName() + ")录入新的指纹验证信息");
        } else {
        	System.out.print("验证信息录入失败");
        }
    }
}
