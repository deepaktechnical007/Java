class Text10 {

    private void show() {
        System.out.println("1");
    }
}

class xyz extends Text10 {

    void show() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        xyz ob = new xyz();
        ob.show();
    }
}
