import java.util.Scanner;
import validate.PassWordVId;
import sys.Door; 

public class APP {
    public static void main(String[] args) {
        while(true){
            Door door = new Door();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("=========源梦计划-门禁系统=========");
            System.out.println("1.管理后台 2.门铃 3.指纹识别 4.密码 5.人脸识别");
            System.out.println("请输入操作对应的数字");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if(userInput.equals("1")){
                PassWordVId identifier = new PassWordVId();
                identifier.identify();
            }
            else if(userInput.equals("2")){
                PassWordVId identifier = new PassWordVId();
                identifier.identify();
            }
            else if(userInput.equals("3")){
                PassWordVId identifier = new PassWordVId();
                identifier.identify();
            }
            else if(userInput.equals("4")){
                PassWordVId identifier = new PassWordVId();
                identifier.identify();
            }
            else if(userInput.equals("5")){
                PassWordVId identifier = new PassWordVId();
                identifier.identify();
            }
        }
    }
}