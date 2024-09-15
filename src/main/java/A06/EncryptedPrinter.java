package A06;

import java.util.HashMap;

public class EncryptedPrinter extends PrinterDecorator{

    private HashMap<String, String> numericValues = new HashMap<>();


    public EncryptedPrinter(Printer printer){
        super(printer);
    }

    @Override
    public void print(String message){
        super.print(encrypt(message));
    }

    protected String encrypt(String message){
        String encrypted = "";
        for (char c : message.toCharArray()){
            encrypted += (char) (c + 3);
        }
        return encrypted;
    }

    protected String decrypt(String message){
        String decrypted = "";
        for (char c : message.toCharArray()){
            decrypted += (char) (c - 3);
        }
        return decrypted;
    }





}
