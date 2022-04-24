/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.ejb.Stateful;

/**
 *
 * @author premkhandelwal
 */
@Stateful
public class BankTransact implements BankTransactLocal {
    int balance=10000;
    @Override
    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int deposite(int amount) {
        balance += amount;
        return balance;
    }
}
