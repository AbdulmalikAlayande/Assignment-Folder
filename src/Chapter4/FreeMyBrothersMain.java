package Chapter4;

public class FreeMyBrothersMain {
    public static void main(String[] args) {
        FreeMyBrothers customer1 = new FreeMyBrothers(565, 65000);
        int limit = customer1.getCreditLimit();
        System.out.println("your credit limit is: "+limit);
        customer1.newBalance();
        int newBalance = customer1.getNewBalance();
        System.out.println("your new balance is "+newBalance);
    }
}
