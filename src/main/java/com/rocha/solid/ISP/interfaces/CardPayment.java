package com.rocha.solid.ISP.interfaces;

public interface CardPayment {
    public boolean validateCardNumber(String cardNumber);
    public boolean validateExpirationDate(String expirationDate);
    public boolean validateCVV(String cvv);

}
