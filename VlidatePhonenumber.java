package com.stackroute.basic;
import java.util.Scanner;

import java.lang.*;
import java.util.regex.*;


public class VlidatePhonenumber {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        VlidatePhonenumber ph = new VlidatePhonenumber();
        String input = ph.getInput();
        boolean result = ph.validatePhoneNumber(input);
        ph.display(result);

    }
    private String getInput() {
        String s = sc.nextLine();
        return s;
    }



    private boolean validatePhoneNumber(String s) {
        try {
            int c = 0;

            s = s.replaceAll("-", "");
            if (s.isEmpty()) {
                return false;
            }
            for (int i = 0; i < s.length(); ++i) {
                if (Character.isDigit(s.charAt(i))) {
                    ++c;
                }
            }
            if (c != 10) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }
            return true;
        } catch (NullPointerException e) {

            return false;
        }
    }
    private void display(boolean result) {
        if(result){
            System.out.println("Valid");
        }
        else
            System.out.println("Invalid or empty string");
    }



}


