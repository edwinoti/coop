package coop.bank.com;

public class BankTabsTest {
	
	private BankTabs banktabs;
	
	@Before
	private void setUp() {
		banktabs  = new BankTabs(DRIVER_PATH/chrome.exe);
	
	}
	
	
	@after
	public void tearDown() {
		banktabs.closeBrowser();
	}
	
	@Test
	public void testOpenTabs() {
		
		try {
			Thread.sleep(2000);//waiting for tab click to load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		banktabs.openTabs1();
		
	}
	
	@Test
	public void testOpenTabs2() {
		
		try {
			Thread.sleep(2000);//waiting for tab click to load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		banktabs.openTabs2();
		
	}
	
	@Test
	public void testOpenTabs3() {
		
		try {
			Thread.sleep(2000);//waiting for tab click to load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		banktabs.openTabs3();
		
	}
	
	@Test
	public void testOpenTabs4() {
		
		try {
			Thread.sleep(2000);//waiting for tab click to load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		banktabs.openTabs4();
	}
		
		@Test
		public void testOpenTabs5() {
			
			try {
				Thread.sleep(2000);//waiting for tab click to load
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			banktabs.openTabs5();
			
		}
		
	
	
	
	

}
