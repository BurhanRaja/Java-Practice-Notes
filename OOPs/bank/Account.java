package bank;

public class Account {
    public void call() {
        System.out.println("Package has been called");
    }

    // Access Modifiers
    public String name; // Can be accessed by any class
    protected String email; // Can be accessed by class within the package file
    private long accNum; // Can be accessed by only Account class

    // getters
    public long getAccNum() {
        return this.accNum;
    }
    public void setAccNum(long accountNumber) {
        this.accNum = accountNumber;
    }
}

// How to access private modifiers?
// getters and setters

class GetandSet {
    public static void main(String[] args) {
        Account newAcc = new Account();
        newAcc.setAccNum(13090921121L);
        System.out.println(newAcc.getAccNum());
    }
}
