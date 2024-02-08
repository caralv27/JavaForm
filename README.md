# JavaForm :rocket: :sparkles:
### Description
The purpose of this projet is to learn how to use Git and JavaFX using the MVC pattern

1. [Git](https://git-scm.com/) 
   - git init
   - git commit -m "Commit message"
   - git add
   - git push
2. [JavaFX](https://openjfx.io/)
   - create a java form using JavaFX
   - create a view using Scene Builder
   - create a controller to execute actions.
  
     
Contributors 
[@CelesteMonter](https://github.com/CelesteMonter)
[@CarlosAlvarado](https://github.com/caralv27/)

### Image sample 
![Sample](https://raw.githubusercontent.com/caralv27/JavaForm/main/screenshot.png)

### This project contains 3 main functions
[Source Code](https://github.com/caralv27/JavaForm/blob/main/src/main/java/com/example/javaform/HelloController.java)

### to calculate
```
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
```

### to process the payment
```
protected void processPayment() {
    mPayment = Double.parseDouble(payment.getText());
    mChange = mPayment - mTotalToPay;


    change.setText(Double.toString(mChange));
}
```

### to clean the form
```
protected void cleanForm() {

      price.setText("");
      quantity.setText("");
      total.setText("");
      discount.setText("");
      totalToPay.setText("");
      payment.setText("");
      change.setText("");
}
```
