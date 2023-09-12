/*
# -*-coding:utf-8 -*-
@File    :   GenericValidate.java
@Time    :   2023/09/09 19:07:20
@Author  :   sourcedream
@Contact :   admin@sourcedream.cn
@License :   (C)Copyright 2023, sourcedream
@Desc    :   None
*/

package validate;

import java.util.Scanner;

public class GenericValidate  implements Validate{
    public GenericValidate(){

    }
    public boolean check(){
        System.out.println("[管理后台消息]有访客按下门铃 要打开门请输入y");
        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("y")){
            return true;
        }
        return false;
    }
}
