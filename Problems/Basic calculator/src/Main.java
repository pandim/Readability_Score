class Problem {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        String res;
        switch (args[0]) {
            case "+":
                res = Integer.toString(a + b);
                break;
            case "-":
                res = Integer.toString(a - b);
                break;
            case "*":
                res = Integer.toString(a * b);
                break;
            default:
                res = "Unknown operator";
        }
        System.out.println(res);
    }
}