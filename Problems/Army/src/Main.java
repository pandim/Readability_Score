class Army {
    @SuppressWarnings("unused")
    public static void createArmy() {
        Unit pers1 = new Unit("U");
        Unit pers2 = new Unit("U");
        Unit pers3 = new Unit("U");
        Unit pers4 = new Unit("U");
        Unit pers5 = new Unit("U");
        Knight pers6 = new Knight("K");
        Knight pers7 = new Knight("K");
        Knight pers8 = new Knight("K");
        General pers9 = new General("G");
        Doctor pers10 = new Doctor("D");

    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

}