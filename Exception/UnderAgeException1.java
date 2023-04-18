class UnderAgeException1 extends RuntimeException {
    UnderAgeException1() {
        super("You are under age");
    }

    UnderAgeException1(String message) {
        super(message);
    }
}

class voting1 {
    public static void main(String[] args) {
        try {
            int age = 17;
            if (age < 18) {
                throw new UnderAgeException1("You cannot vote as your age is below 18");
            } else {
                System.out.println("you can vote now...!!");
            }
        } catch (UnderAgeException1 e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
