package sys;

import java.util.Scanner;
public class InputEquip {
    private String input;

    public String getInput(){
        return this.input;
    }

    public void setInput(String input){
        this.input = input;
    }

    public void input(){
        System.out.println("请输入认证信息: ");
        Scanner input= new Scanner(System.in);
        String info=input.next();
        this.setInput (info);
    }
}