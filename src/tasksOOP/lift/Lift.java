package tasksOOP.lift;


class Lift {
    int curFloor = 1; //Этаж online
    int countFloat; //Общее к этаж перемещ
    int countPeople; //Перевезенные люди
    int currentCountPeople; //Люди в доме
    //Singleton
    private static Lift lift1 = new Lift();

    private Lift() {

    }

    public static Lift getLift() {
        return lift1;
    }

    public void move(int countHuman, int nextFloor) throws MyException {
        if (curFloor != 1 && countHuman > 0 && (currentCountPeople + countHuman < 0))
            throw new MyException("В доме нет столько людей");

        if (countHuman >= 0)
            countPeople += countHuman;
        if (curFloor == 1)
            currentCountPeople += countHuman;


        countFloat += Math.abs(curFloor - nextFloor);
        curFloor = nextFloor;

        MainLift.inLift += countHuman;
    }

    public void printAboutMe() {
        System.out.println("Текущий этаж: " + curFloor);
        System.out.println("Общее кол-во этажей перемещения " + countFloat);
        System.out.println("Перевезенные люди " + countPeople);
        System.out.println("Люди в доме " + currentCountPeople);
    }
}
