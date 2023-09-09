/*
# -*-coding:utf-8 -*-
'''
@File    :   Computer.java
@Time    :   2023/09/09 19:04:54
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/

package sys;
import validate.Validate;
import validate.FingerMarkVId;
import validate.PassWordVId;
import validate.GenericValidate;                                                                         
import validate.CardVId;

public class Computer {
    Validate validate;

    public boolean validate(String inputInfo){
        String[] strs =inputInfo.split(":");
        String equip =strs[0]; // 设备
        String input = strs[1];
        boolean result = false;
        // 实现多态
        //反射才能正真实现可扩展性
        if("card".equals(equip)){
            validate = new CardVId();
            result  = validate.check();
        }else if("finger".equals(equip)){
            validate = new FingerMarkVId(input);
            result  =validate.check();
        }else if("pass".equals(equip)){
            // System.out.print("test");
            validate = new PassWordVId(input);
            result  = validate.check();
        }else{
            validate = new GenericValidate();
            result  = validate.check();
        }
        return result;
    }
}