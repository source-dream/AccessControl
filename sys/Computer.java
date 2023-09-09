package sys;
import validate.Validate;
import validate.FingerMarkVId;
import validate.PassWordVId;
import validate.GenericValidate;
import validate.CardVId;

public class Computer {
    Validate validate;

    public boolean validate(String inputInfo){
        String[] strs =inputInfo.split(":");
        String equip =strs[0]; // 设备
        boolean reesult = false;
        // 实现多态
        //反射才能正真实现可扩展性
        if("card".equals(equip)){
            validate = new CardVId();
            return validate.check();
        }else if("finger".equals(equip)){
            validate = new FingerMarkVId();
            validate.check();
        }else if("pass".equals(equip)){
            validate = new PassWordVId();
            validate.check();
        }else{
            validate = new GenericValidate();
            validate.check();
        }
        return false;
    }
}