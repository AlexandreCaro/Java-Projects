public class Account {

    private int value;

    public void deposit(int d){
        value+=d;
    }
}

interface AccountObserver{
    public void accountHasChanged(int newValue);
}

class ObservableAccount{

    private int value;
    private AccountObserver observer;

    public void deposit(int d){
        value+=d;
        if(observer!=null){
            observer.accountHasChanged(value);
        }
    }

    public void setObserver(AccountObserver o){
        observer = o;
    }
}
