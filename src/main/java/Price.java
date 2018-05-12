

public abstract class Price {
	public abstract int getPriceCode();

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
}