/*
# -*-coding:utf-8 -*-
@File    :   Guest.java
@Time    :   2023/09/09 19:06:54
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/


package user;
import sys.ControlSys;
import java.util.Scanner;

public class Guest{
    private String name;

    public Guest(){}
    public Guest (String name){this.name = name;}
    
    public void pressRing (ControlSys controlSys){
        Scanner scanner=new Scanner(System.in);
        System.out.print("访客("+this.getName()+")按门铃？[y/n]:");
        String btn = scanner.nextLine();
        if(btn.equals ("y")){
            controlSys.ring();
        }else if(btn.equals("n")){
            return;
        }
    }

    public String getName(){return name;}
}