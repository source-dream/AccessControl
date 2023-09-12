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
        ControlSys controlSys = new ControlSys();
        while(true){
            controlSys.getInputEquip().input();
            controlSys.work();
        }
    }
}