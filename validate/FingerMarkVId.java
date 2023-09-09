/*
# -*-coding:utf-8 -*-
@File    :   FingerMarkVId.java
@Time    :   2023/09/09 19:07:12
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/


package validate;

public class FingerMarkVId implements Validate{
    private String input;
    
    public FingerMarkVId(String input){
        this.input = input;
    }

    public boolean check(){
        return false;
    }

    public String getInput() {
        return input;
    }
}