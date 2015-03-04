package Main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PS3_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void ut_accountTestBalance() {
		Account a = new Account(1122, 20000);
		a.setAnnualInterestRate(4.5);
		a.deposit(3000);
		double actualBalance = 23000;
		double actualRate = 4.5;
		int actualId = 1122;
		
		assertTrue(a.getAnnualInterestRate() == actualRate);
		assertTrue(a.getBalance() == actualBalance);
		assertTrue(a.getId() == actualId);
		
		
		
		
	}
	@Test
	public void ut_accountTestWithdraw() throws InsufficientFundsException{
		Account a  = new Account(1122, 20000);
		a.withdraw(2500);
		double balanceAfter = 17500;
		
		assertTrue(a.getBalance() == balanceAfter);
		
	}
	@Test

	public void ut_withdrawTooMuch() throws InsufficientFundsException{ 
		Account a = new Account(1122, 20000);
		a.withdraw(30000);
		double withdrawAmount = 30000;
		double originalBalance = 20000;
		double newBalance = -10000;
		
		assertTrue("You withdrew too much from your account", a.getBalance() == newBalance);
		
		assertTrue("The newBalance is less than 0", newBalance < 0);
		
		assertTrue("Withdraw > originalBalance", withdrawAmount  > originalBalance);
		
	}
	}


