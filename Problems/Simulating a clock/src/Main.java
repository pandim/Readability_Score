class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (minutes == 59) {
            minutes = 0;
            hours = (hours == 12 ? hours = 1 : ++hours);
        } else {
            ++minutes;
        }
    }
}