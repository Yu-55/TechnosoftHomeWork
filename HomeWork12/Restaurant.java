package HomeWork12;

public class Restaurant {
    private final String restaurantName;
    private final int maxGuestCapacity;
    private int currentGuestCount = 0;
    private int totalGuestsSoFar = 0;

    public Restaurant(String restaurantName, int maxGuestCapacity) {
        this.restaurantName = restaurantName;
        this.maxGuestCapacity = maxGuestCapacity;
    }

    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant("ComeEat", 50);
        myRestaurant.isAvailable(3);
        myRestaurant.seatsParty(30);
        myRestaurant.seatsParty(3);
        myRestaurant.removeParty(20);
        myRestaurant.seatsParty(37);
        myRestaurant.restaurantSummary();

    }

    public void isAvailable(int requestedSeats) {
        if (requestedSeats <= 0) {
            System.out.println("Please enter valid amount");
        } else if (maxGuestCapacity - currentGuestCount >= requestedSeats) {
            System.out.println("Table for " + requestedSeats + " is available welcome to " + restaurantName);
        } else {
            System.out.println("Table for " + requestedSeats + " is not available at this moment " +
                    "but it should be available at the nearest time, please check a bit later");
        }
    }

    public void seatsParty(int addSeats) {
        if (addSeats <= 0) {
            System.out.println("Please enter valid amount");
        } else if (addSeats > maxGuestCapacity - currentGuestCount) {
            System.out.println("Not able to add " + addSeats + " guests," + " you can add less or equal to " + (maxGuestCapacity - currentGuestCount) +
                    " guests");
        }else{
            currentGuestCount += addSeats;
            totalGuestsSoFar += addSeats;
        }

    }


    public void removeParty(int removeSeats) {
        currentGuestCount = currentGuestCount - removeSeats;
        System.out.println("There are currently " + currentGuestCount + " guests in " + restaurantName);
    }

    public void restaurantSummary() {
        System.out.println("Name: " + restaurantName +
                "\nMax capacity: " + maxGuestCapacity +
                "\nCurrent guest count: " + currentGuestCount +
                "\nTotal guests served so far: " + totalGuestsSoFar);
    }
}
