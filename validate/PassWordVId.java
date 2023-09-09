
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
    private String input;
    private String[] passWords = {"sourcedream"};
    public PassWordVId(String input){
        this.input = input;
    }
    public boolean check(){
        for (String password : this.passWords) {
            if (input.equals(password)) {
                return true;
            }
        }
        return false;
    }
    public String getInput() {
        return input;
    }
}