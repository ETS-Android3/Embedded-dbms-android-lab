package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl;

import static org.junit.Assert.*;

import android.app.Activity;

import org.junit.Test;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.DBHandler;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.exception.InvalidAccountException;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;

public class PersistantAccountDAOTest extends Activity {

    @Test
    public void getAccount() throws InvalidAccountException {
        String accountNo="1";
        String bankName = "bank";
        String accountHolderName = "accountHolderName";
        Double balance = 1234.0;
        Account newAccount= new Account(accountNo,bankName,accountHolderName,balance);
        PersistantAccountDAO testAccDAO= new PersistantAccountDAO(new DBHandler(getApplicationContext()));
        testAccDAO.addAccount(newAccount);
        Account output= testAccDAO.getAccount(accountNo);
        assertEquals(newAccount,output);
    }

    @Test
    public void addAccount() throws InvalidAccountException {
        String accountNo="1";
        String bankName = "bank";
        String accountHolderName = "accountHolderName";
        Double balance = 1234.0;
        Account newAccount= new Account(accountNo,bankName,accountHolderName,balance);
        PersistantAccountDAO testAccDAO= new PersistantAccountDAO(new DBHandler(getApplicationContext()));
        testAccDAO.addAccount(newAccount);
        Account output= testAccDAO.getAccount(accountNo);
        assertEquals(newAccount,output);
    }
}