package org.example;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Client piesoCustomer = new Client("Pieso", "tata", 1);
        Client lukasCustomer = new Client("Lukas", "huhu", 2);

        BankService piesoBankService = new BankService();
        BankService lukasBankService = new BankService();

        Account piesoAcc = piesoBankService.createAccount(piesoCustomer);
        Account lukasAcc = lukasBankService.createAccount(lukasCustomer);

        System.out.println(piesoAcc);
        System.out.println(lukasAcc);

        piesoAcc.setAccBalance(new BigDecimal(2.0));

        System.out.println(piesoAcc.getAccBalance());

        piesoAcc.withdrawMoney(new BigDecimal(1.0));

        System.out.println(piesoAcc.getAccBalance());
    }
}