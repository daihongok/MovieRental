
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    /**
     * @uml.property  name="_title"
     */
    private String _title;
    /**
     * @uml.property  name="_price"
     */
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getTitle() {
        return _title;
    }

    public double getCharge(int daysRented) {
        double relust = 0;
        switch(getPriceCode()) {
            case Movie.REGULAR:
                relust += 2;
                if (daysRented > 2)
                    relust += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                relust += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                relust += 1.5;
                if (daysRented > 3)
                    relust += (daysRented - 3) * 1.5;
                break;
        }
        return relust;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if(getPriceCode() == Movie.NEW_RELEASE && daysRented > 1)
            return  2;
        else
            return 1;
    }
}
