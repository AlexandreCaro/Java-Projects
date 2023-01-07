// Other Important Java Class: Account.java

public class MyObserver implements AccountObserver{
    @Override
    public void accountHasChanged(int newValue){
        System.out.println("Account has changed. New value: " + newValue);
    }
}

class MyMain{
    public static void main(String[] args) {
        ObservableAccount account = new ObservableAccount();
        MyObserver observer = new MyObserver();

        account.setObserver(observer);

        account.deposit(100);
        account.deposit(50);
    }
}
