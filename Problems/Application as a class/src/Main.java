class Application {

    String name;

    void run(String[] args) {
        System.out.println(name);
        for (String string : args) {
            System.out.println(string);
        }
    }
}