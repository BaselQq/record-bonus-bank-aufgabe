package org.example;

import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class BankService {

    private Account account;

    public BankService(Account account) {
        this.account = account;
    }

    public BankService() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankService that = (BankService) o;
        return Objects.equals(account, that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }

    @Override
    public String toString() {
        return "BankService{" +
                "account=" + account +
                '}';
    }

    // Open a new Account in bank
    public Account createAccount(Client customer) {
        byte[] array = new byte[5];
        new Random().nextBytes(array);
        String accRandomNr = new String(array, Charset.forName("UTF-8"));

        Account account = new Account(accRandomNr, new BigDecimal(0.0) , customer);

        return account;
    }
}
