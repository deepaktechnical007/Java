class UnderAgeException extends Exception {
    UnderAgeException() {
        super("You are under age");
    }

    UnderAgeException(String message) {
        super(message);
    }
}

class voting {
    public static void main(String[] args) {

        int age = 17;
        try {
            if (age < 18) {
                throw new UnderAgeException();
            } else {
                System.out.println("you can vote now...!!");
            }
        } catch (UnderAgeException e) {
            e.printStackTrace();
        }
    }
}
