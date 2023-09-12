
/*
# -*-coding:utf-8 -*-
@File    :   PassWordVId.java
@Time    :   2023/09/09 19:07:27
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/
package validate;

public class PassWordVId  implements Validate{
    private String passStr;
    private String[] passWords = null;
    public PassWordVId(String passStr, String[] passWords){
        this.passStr = passStr;
        this.passWords = passWords;
    }
    public boolean check(){
        for (String password : this.passWords) {
            if (passStr.equals(password)) {
                return true;
            }
        }
        return false;
    }
}