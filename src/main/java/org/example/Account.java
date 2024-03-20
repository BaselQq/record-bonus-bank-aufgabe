package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {

    private String accNr;
    private BigDecimal accBalance = new BigDecimal(0.0);
    private Client client;

    public Account(String accNr, BigDecimal accBalance, Client client) {
        this.accNr = accNr;
        this.accBalance = accBalance;
        this.client = client;
    }

    public Account() {
    }

    public String getAccNr() {
        return accNr;
    }

    public void setAccNr(String accNr) {
        this.accNr = accNr;
    }

    public BigDecimal getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(BigDecimal accBalance) {
        this.accBalance.add(accBalance);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accNr, account.accNr) && Objects.equals(accBalance, account.accBalance) && Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accNr, accBalance, client);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNr='" + accNr + '\'' +
                ", accBalance=" + accBalance +
                ", client=" + client +
                '}';
    }

    public void withdrawMoney(BigDecimal bigDecimal) {
        this.accBalance.subtract(bigDecimal);
    }
}
