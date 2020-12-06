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
public class CalculatorController implements OnPressButton {
    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;
    
    public CalculatorController(CalculatorView calculatorView, CalculatorModel calculatorModel){
        this.calculatorModel = calculatorModel;
        this.calculatorView = calculatorView;
        this.calculatorView.setOnPressButton(this);
    }
    
    public CalculatorController() {
    }
    
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(view, model);
        view.setVisible(true);
    }

    int inputValue = 0;
    boolean isEqualPressed = false;
    
    @Override
    public void onPressNumber(int number) {
        inputValue = inputValue * 10 + number;
//        System.out.println("input value: " + inputValue);
        if (isEqualPressed) {
            calculatorModel.setNum2(inputValue);
        } else {
            calculatorModel.setNum1(inputValue);
        }
//        System.out.println("press: " + number);
    }

    @Override
    public void onPressCalculator(int type) {
//        System.out.println("Type: " + type);
        inputValue = 0;
        isEqualPressed = true;
        calculatorModel.setType(type);
    }

    @Override
    public void onPressEqual() {
//        System.out.println("Result: " + calculatorModel.getValue());
        isEqualPressed = true;
//        System.out.println(calculatorModel.getNum1());
//        System.out.println(calculatorModel.getNum2());
        calculatorView.showValue(calculatorModel.getValue());
    }

    @Override
    public void onPressDelete() {
        inputValue = 0;
        calculatorModel.setNum1(0);
        calculatorModel.setNum2(0);
    }

}
