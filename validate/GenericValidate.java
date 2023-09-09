package validate;

import java.util.Scanner;

public class GenericValidate {
    private static String[] passwords = {"88888888", "666666"};
    public static void identify() {
        try{
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("==========人脸识别验证========");
            System.out.print("请输入人脸信息:");
            boolean loginSuccessful = false;
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            for (String storedPassword : passwords) {
                if (password.equals(storedPassword)) {
                    loginSuccessful = true;
                    break;
                }
            }
            if (loginSuccessful) {
                System.out.println("登录成功 - 正在开门");
            } else {
                System.out.println("登录失败");
            }
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}