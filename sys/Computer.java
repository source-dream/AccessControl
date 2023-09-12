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

import validate.*;                                                                         

public class Computer {
    private String[] passWord   = new String[100];  // 计算机存储的雇员密码，数字字符串
    private String[] card       = new String[100];  // 计算机存储的雇员胸卡号，字符串形式
    private String[] fingerMark = new String[100];  // 计算机存储的雇员指纹，字符串形式
    
    public Computer(){
        passWord[0]   = "sourcedream";
        card[0]   = "sourcedream";
        fingerMark[0] = "sourcedream";
    }

    public boolean validate(String inputInfo){
        Validate validate = null;
        String[] strs =inputInfo.split(":");
        System.out.println("test");
        String equip =strs[0]; // 设备
        boolean result = false;
        if(strs.length == 1){
            if("y".equals(equip)){
            validate = new GenericValidate();
            result = validate.check();
            }else{
                result = false;
            }
            return result;
        }
        String passStr = strs[1];
        // 实现多态
        //反射才能正真实现可扩展性
        // 验证卡片
        if("card".equals(equip)){
            validate = new CardVId(passStr, card);
            result  = validate.check();
        }else if("finger".equals(equip)){
            validate = new FingerMarkVId(passStr, fingerMark);
            result  =validate.check();
        }else if("pass".equals(equip)){
            validate = new PassWordVId(passStr, passWord);
            result  = validate.check();
        }else {
            result = false;
        }
        return result;
    }
    public void addCard(String card) {
        for(int i=0;i<100;i++){
            if(this.card[i]==null){
                this.card[i] = card;
                return;
            }
        }
    }
    public void addFingerMark(String fingerMark) {
        for(int i=0;i<100;i++){
            if(this.fingerMark[i]==null){
                this.fingerMark[i] = fingerMark;
                return;
            }
        }
    }
    public void addPassWord(int passWord) {
        for(int i=0;i<100;i++){
            if(this.passWord[i]==null){
                this.passWord[i] = passWord*2+"";
                return;
            }
        }
    }
    public String[] getCard() {
        return card;
    }
    public String[] getfingerMark() {
        return fingerMark;
    }
    public String[] getPassWord() {
        return passWord;
    }
}