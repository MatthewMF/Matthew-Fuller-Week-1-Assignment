public class LoanAccount extends Account{
    double LBal = 100000; 
    double OBal = 0;
    double IR = .20;
    double principal = 0 - LBal;
    double intrest = LBal * IR;
    double principalPaid = 0;
    double intrestPaid = 0;
    double outstandingBal = 0;
    public void setOBal(double _OBal){
        this.OBal = _OBal;
    }
    /*public void setLBal(double _LBal){
        this.LBal = _LBal;
    }*/
    public double getLBal(){
        return this.LBal;
    }
    LoanAccount(){
        super();
    }

    public void compoundIntrest() {
    this.intrest += ((1+IR) * (principal+intrest)); 
    }
      
    public double getPrincipal(){
        return principal;
    }

    public double getIntrest(){
        return intrest;
    }
    /*@Override
    public boolean withdraw(double _amount){
        if(_amount > LBal)
        {
            System.out.println("You cannot withdraw a loan that high. ")
            return false;
        }
        if(_amount <= 0)
        {
            System.out.println("Incorrect Amount. Value is less than or equal to 0. ");  
            return false;
        }
        if(_amount < LBal)
        {
            
        }
    }*/

    @Override
    public String toString() {
        String content = "You have taken a loan of $" + LBal + " with an interest rate of " + IR*100 + "%" + "\n";
        return content;
    } 

    @Override 
    public boolean deposit(double _amount){
        if(_amount <= 0){
            System.out.println("Incorrect Amount. Value is less than or equal to 0. ");
            return false;
        }
        if(_amount == LBal + intrest)
        {
            //outstandingBal = (LBal + intrest) - _amount;
            System.out.println("Yay! You've paid off your loan!");
            return true;
        }
        if(_amount >= intrest && _amount < LBal + intrest){
            _amount = (_amount - intrest);
            outstandingBal = principal + _amount;
            outstandingBal = 0 - outstandingBal; 
            System.out.println("You currently have an outstanding balance of $" + outstandingBal + " left of your loan to pay off.");
            return true;
        }
        if(_amount < intrest){
            intrest = intrest - _amount;
            System.out.println("You deposited $" + _amount + " to your LoanAccount. You still have an interest of $" + intrest + " left to pay.");
            return true;
        }
        else
        {
            outstandingBal = (LBal + intrest) - _amount; 
            System.out.println("You have an outstanding balance of $" + outstandingBal); //the bank owes money (probably)
            return true;
        }
    }

}
