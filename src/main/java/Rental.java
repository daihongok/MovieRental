
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double amountFor() {
        double relust = 0;
        switch(getMovie().getPriceCode()) {
            case Movie.REGULAR:
                relust += 2;
                if (getDaysRented() > 2)
                    relust += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                relust += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                relust += 1.5;
                if (getDaysRented() > 3)
                    relust += (getDaysRented() - 3) * 1.5;
                break;
        }
        return relust;
    }
}
