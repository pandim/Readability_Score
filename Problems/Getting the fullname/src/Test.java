public class Test {
    public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName()); // Tim Towler

        User katie = new User();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName()); // Katie (without additional spaces)

    }
}
