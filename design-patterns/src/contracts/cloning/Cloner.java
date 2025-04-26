package cloning;

public class Cloner {
    public static void main(String[] args) {
        //Address address = new Address("102 hogrider", "Niggville", "USA", 20114);
        
        User user1 = null;
        User user = new User(new Name("Lamar", "Jackson"), 28, 
                    new Address("22899 N Brown", "Ashburn", "VA", 20148));

        System.out.println(user.address.toString());

        try {
            user1 = (User) user.clone();
        } catch (Exception e) {

        }

        System.out.println("Before Cloned changes");
        
        System.out.println(user.toString());
        System.out.println(user1.toString());

        user1.address.zip = 20000;
        user1.name.lastName = "TheMan";
        

        System.out.println("After Cloned changes");

        System.out.println(user.toString());
        System.out.println(user1.toString());
        

        //shallow copy
        //System.out.println("Shallow copy:");
        //User ClonedUser = (User) user.clone();
        //System.out.println("obj 1: " + user.toString());



    }
}
