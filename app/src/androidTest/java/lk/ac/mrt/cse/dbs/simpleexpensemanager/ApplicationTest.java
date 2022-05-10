/*
 * Copyright 2015 Department of Computer Science and Engineering, University of Moratuwa.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *                  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package lk.ac.mrt.cse.dbs.simpleexpensemanager;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.ExpenseManager;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.PersistantExpenseManager;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.exception.InvalidAccountException;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistantAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.ExpenseType;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Transaction;

import static org.junit.Assert.assertEquals;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest {
    private ExpenseManager expenseManager;
    private Context context;

    @Before
    public void setUp() {
        context = ApplicationProvider.getApplicationContext();
        expenseManager = new PersistantExpenseManager(new DBHandler(context));
    }

    @Test
    public void getAccount() throws InvalidAccountException {
        String accountNo="1";
        String bankName = "bank";
        String accountHolderName = "accountHolderName";
        Double balance = 1234.0;
        Account newAccount= new Account(accountNo,bankName,accountHolderName,balance);
        PersistantAccountDAO testAccDAO= new PersistantAccountDAO(new DBHandler(context));
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
        PersistantAccountDAO testAccDAO= new PersistantAccountDAO(new DBHandler(context));
        testAccDAO.addAccount(newAccount);
        Account output= testAccDAO.getAccount(accountNo);
        assertEquals(newAccount,output);
    }


}
