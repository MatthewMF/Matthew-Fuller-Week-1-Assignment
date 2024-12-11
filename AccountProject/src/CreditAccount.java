public class CreditAccount extends Account{
    double creditLimt = 5000;
    public double creditBal = creditLimt;
    public void setcBal(double _cBal){
        this.creditBal = _cBal;
    }
    public double getcBal(){
        return this.creditBal;
    }

    CreditAccount(){
        super();
    }

     @Override
     public boolean deposit(double _amount){
         if(_amount <= 0){
            System.out.println("Incorrect Amount. Value is less than or equal to 0. ");
            return false;
        }
        setcBal( getcBal() + _amount);
        return true;

     }

     @Override
    public boolean withdraw(double _amount){
        if((_amount > creditBal) || (_amount > creditLimt)){
            System.out.println("Thats past your limit!");
            return false; 
        }
        if(_amount <= 0){
            System.out.println("Really?");
            return false;
        }
        double _cBal = getcBal();
        _cBal = _cBal - _amount;
        setcBal(_cBal);
        return true;
    }
     @Override
    public String toString() {
        String content = "The current Credit Balance = $" + getcBal() + "\n";
        return content;
        
    }
}
