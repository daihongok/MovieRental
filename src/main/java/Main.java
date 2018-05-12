public class Main {
    public static void main(String[] args) {
        //NEW_RELEASE
        Movie new_release = new Movie("Ready Player One",1);
        //regular
        Movie regular = new Movie("3 Idiots",0);
        //childrens
        Movie childrens = new Movie("Kung Fu Panda",2);

        Customer customer = new Customer("Jack");
        Rental rental = new Rental(childrens,5);
        Rental rental1 = new Rental(new_release,3);

        customer.addRental(rental);
        customer.addRental(rental1);
        System.out.println(customer.statement());
        System.out.println(customer.htmlStatement());
    }
}
