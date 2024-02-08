package com.example.javaform;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField price = new TextField();
    @FXML
    private TextField quantity = new TextField();
    @FXML
    private TextField total = new TextField();

    @FXML
    private TextField discount = new TextField();

    @FXML
    private TextField totalToPay = new TextField();


    @FXML
    private TextField payment = new TextField();

    @FXML
    private TextField change = new TextField();

    double mPrice;
    double mQuantity;
    double mTotal;
    double mDiscount;
    double mTotalToPay;
    double mPayment;
    double mChange;

    @FXML
    protected void calculate() {
        mPrice = Double.parseDouble(price.getText());
        mQuantity = Double.parseDouble(quantity.getText());
        mTotal = mPrice * mQuantity;
        total.setText(Double.toString(mTotal));

        if (mTotal > 200) {
            mDiscount = mTotal * 0.35;
            discount.setText(Double.toString(mDiscount));
        } else {
            mDiscount = 0;
            discount.setText(Double.toString(mDiscount));
        }

        mTotalToPay = mTotal - mDiscount;
        totalToPay.setText(Double.toString(mTotalToPay));
    }

    @FXML
    protected void processPayment() {
        mPayment = Double.parseDouble(payment.getText());
        mChange = mPayment - mTotalToPay;


        change.setText(Double.toString(mChange));
    }

    @FXML
    protected void cleanForm() {

          price.setText("");
          quantity.setText("");
          total.setText("");
          discount.setText("");
          totalToPay.setText("");
          payment.setText("");
          change.setText("");
    }
}