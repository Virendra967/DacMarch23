class Bank{
  String BankName,CustomerName,IFSC,BranchName;
  double AcNumber,Balance,MobileNo;
  
  void Display(String BankName,String CustomerName,String IFSC,String BranchName,Double AcNumber,Double Balance,Double MobileNo)
  {
    System.out.println(BankName+" "+CustomerName+" "+IFSC+" "+BranchName+" "+AcNumber+" "+Balance+" "+MobileNo);
  }
  void CheckBalance()
  {
	  System.out.println("Checking balance");
  }
  void DepositMoney()
  {
	  System.out.println("Depositing Money");
  }
  void TranferBalance()
  {
	  System.out.println("Transferring balance");
  }
  void DoFixedDeposit
  {
	  System.out.println("FD Done")
  }
  
  public static void main(String args[])
  {
    Bank b1= new Bank();
	b1.Display("SBI","Virendra Tiwari","SBIN0000000","Bhopal",48786.0,99999999999999.0,79852.0);
	b1.CheckBalance();
	b1.DepositMoney();
	b1.TranferBalance();
	b1.DoFixedDeposit();
  }
}