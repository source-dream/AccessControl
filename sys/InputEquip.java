/*
# -*-coding:utf-8 -*-
'''
@File    :   InputEquip.java
@Time    :   2023/09/09 19:05:23
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/

package sys;

import java.util.Scanner;
public class InputEquip {
    private String input = null;

    public void input(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("身份验证: ");
        String passStr = scanner.nextLine();
        this.setInput(passStr);
    }
    public InputEquip(){}
    
    public String getInput() { return input;}

    public void setInput(String input){this.input = input;}

}