/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.ejb.Local;

/**
 *
 * @author premkhandelwal
 */
@Local
public interface BankTransactLocal {

    int withdraw(int amount);

    int deposite(int amount);
    
}
