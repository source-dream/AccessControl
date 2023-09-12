/*
# -*-coding:utf-8 -*-
@File    :   CardVId.java
@Time    :   2023/09/09 19:06:59
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/


package validate;

public class CardVId  implements Validate{
    private String passStr;
    private String[] passWords = null;
    public CardVId(String passStr, String[] passWords){
        this.passStr = passStr;
        this.passWords = passWords;
    }
    public boolean check(){
        for(String cardID :this.passWords){
            if(passStr.equals(cardID)){
                return true;
            }
        }
        return false;
    }
}