/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author macbook
 */
public class CalculatorModel {
    
    private int num1;
    private int num2;
    private int value;
    private int type;
    
    public int addValue(int num1, int num2){
        return num1+num2;
    }
    
    public int subValue(int num1, int num2){
       return num1-num2;
    }
    
    public int mulValue(int num1, int num2){
        return num1*num2;
    }
    
    public int divValue(int num1, int num2){
       return num1/num2;
    }
    
    public int getValue(){
//        System.out.println(this.type);
        int value = 0;
        switch(this.type){
            case 1: {
                value = addValue(num1, num2);
                break;
            }
            case 2: {
                value = subValue(num1, num2);
                break;
            }
            case 3: {
                value = mulValue(num1, num2);
                break;
            }
            case 4: {
                value = divValue(num1, num2);
                break;
            }
        }
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    
    
    
}
