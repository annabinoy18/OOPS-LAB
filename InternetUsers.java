public class InternetUsers {

    // Static variables
    static int count = 0;
    static int happyCustomers;
    static final int MAX_TIME = 2; // in hours

    // Non-static variables
    String loginName;

    // Static block
    static {
        System.out.println("Let's start browsing!");
        System.out.println("Maximum allotted time for browsing: " + MAX_TIME + " hrs");
        happyCustomers = count + 1;
    }

    // Constructor
    public InternetUsers(String loginName) {
        this.loginName = loginName;
        count++;
    }

    // Static method to display number of internet users and happy customers
    static void show() {
        System.out.println("Number of Internet Users: " + count);
        System.out.println("Number of Happy Customers: " + happyCustomers);
    }

    // Non-static method to compute and display the name of happy customers
    void compute() {
        if (count <= happyCustomers) {
            System.out.println(loginName + " is a happy customer!");
        }
    }

    public static void main(String[] args) {
        // Creating instances of InternetUsers
        InternetUsers user1 = new InternetUsers("User1");
        InternetUsers user2 = new InternetUsers("User2");
        InternetUsers user3 = new InternetUsers("User3");

        // Displaying information using static method
        show();

        // Computing and displaying happy customers
        user1.compute();
        user2.compute();
        user3.compute();
    }
}
