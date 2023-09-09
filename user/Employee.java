/*
# -*-coding:utf-8 -*-
'''
@File    :   Employee.java
@Time    :   2023/09/09 19:04:11
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/

package user;
import sys.ControlSys;

public class Employee extends Guest{
    public Employee(){super();}
    public Employee(String name){super(name);}
    public void input(ControlSys controlSys){controlSys.getInputEquip().input();}
}