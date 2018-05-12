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
        customer.addRental(rental);
        System.out.println(customer.statement());
    }
}
