package sys;
import java.util.Scanner;


public class Backgrand {
    public Backgrand() {
    }
    public void run(){
        while(true){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("==============后台管理系统=============");
            System.out.println("查询数据库信息：info");
            System.out.println("添加雇员：add username password");
            System.out.println("删除雇员：remove id");
            System.out.println("修改密码：update id password");
            Scanner scanner= new Scanner(System.in);
            String optionStr = scanner.nextLine();
            String[] strs =optionStr.split(" ");
            if(optionStr.equals("exit")){
                break;
            }
            Database database = new Database();
            if(strs[0].equals("info")){
                database.getAllEmployees();
            }else if(strs[0].equals("add")){
                database.addEmployee(strs[1], strs[2]);
            }else if(strs[0].equals("remove")){
                database.deleteEmployee(Integer.parseInt((strs[1])));
            }else if(strs[0].equals("update")){
                database.changePassword(strs[1], strs[2]);
            }else{
                System.out.println("输入操作错误，请重新输入");
            }
            try {
                Thread.sleep(5000);         
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            database.closeConnection();
        }
    }
}
