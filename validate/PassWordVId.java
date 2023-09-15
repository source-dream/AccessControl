
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

import java.util.Map;

import sys.*;

public class PassWordVId  implements Validate{
    private String id;
    private String pwd;
    private Map<String, String> passWords;
    public PassWordVId(String id, String pwd){
        this.id = id;
        this.pwd = pwd;
        Database database = new Database();
        this.passWords =  database.getPassword();
        database.closeConnection();
    }
    public boolean check(){
        String storedPwd = passWords.get(id);
        return storedPwd != null && storedPwd.equals(pwd);
    }
}