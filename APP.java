/*
# -*-coding:utf-8 -*-
@File    :   APP.java
@Time    :   2023/09/09 19:06:04
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/

import user.Employee;
import sys.ControlSys;
public class APP {
    public static void main(String[] args) {
        // while(true){
        //     System.out.print("\033[H\033[2J");
        //     System.out.flush();
        //     System.out.println("=========源梦计划-门禁系统=========");
        //     System.out.println("1.管理后台 2.门铃 3.指纹识别 4.密码 5.人脸识别");
        //     System.out.println("请输入操作对应的数字");
        //     Scanner scanner = new Scanner(System.in);
        //     String userInput = scanner.nextLine();
        //     if(userInput.equals("1")){
        //         PassWordVId identifier = new PassWordVId();
        //         identifier.identify();
        //     }
        //     else if(userInput.equals("2")){
        //         PassWordVId identifier = new PassWordVId();
        //         identifier.identify();
        //     }
        //     else if(userInput.equals("3")){
        //         PassWordVId identifier = new PassWordVId();
        //         identifier.identify();
        //     }
        //     else if(userInput.equals("4")){
        //         PassWordVId identifier = new PassWordVId();
        //         identifier.identify();
        //     }
        //     else if(userInput.equals("5")){
        //         PassWordVId identifier = new PassWordVId();
        //         identifier.identify();
        //     }
        // }
        Employee employee = new Employee("源梦");
        ControlSys controlSys = new ControlSys();
        while(true){
            employee.input(controlSys);
            controlSys.work();
        }
    }
}