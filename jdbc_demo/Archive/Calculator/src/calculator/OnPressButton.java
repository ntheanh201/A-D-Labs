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
public interface OnPressButton {
    void onPressNumber(int number);
    void onPressCalculator(int type);
    void onPressEqual();
    void onPressDelete();
}
