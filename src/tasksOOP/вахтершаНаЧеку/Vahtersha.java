package tasksOOP.вахтершаНаЧеку;


public class Vahtersha implements AddFriends, RemoveFriends, AddOwners, RemoveOwners {
    // Fields
    private String name;
    private int age;
    private int countOwner = 0;
    private int countFriend = 0;
    private int status = 0;
    // 0 - общага пустая, никого нельзя удалить
    // 1 - гостей больше не могу пустить
    // 2 - все нормально запускаю и выпускаю за деньги

    // Getters and Setters
    public  void setName(String name) {this.name = name;}
    public  void setAge(int age) {this.age = age;}
    public  String getName() {return name;}
    public  int getAge() {return age;}

    //  Methods
    public void addFriends(int count) {
        countFriend = countFriend + count;
        System.out.println("Запустила " + count + " хозяев, и теперь в общаге " + countFriend + " хозяев, всего");
        status = 2;
    }

    public void addOwners(int count) {
        if (count <= (countFriend - countOwner)) {
            countOwner = countOwner + count;
            System.out.println("Запустила " + count + " гостей, и теперь в общаге " + countOwner + " гостей, всего");
            status = 2;
        } else {
            System.out.println("Я не могу запустить" + count + " гостей, их будет больше чем хозяев");
            status = 2;
        }
    }

    public void removeFriends(int count) {
        if (count <= countFriend && (countFriend - count) >= countOwner) {
            countFriend = countFriend - count;
            System.out.println("Выпустила " + count + " хозяев, и теперь в общаге " + countFriend + " хозяев, всего");
            status = 2;
        } else {
            System.out.println("Я не могу выпустить " + count + " хозяев, так как их и так мало в доме");
            status = 2;
        }
        if (countOwner == 0 && countFriend == 0)
            status = 0;
    }

    public void removeOwners(int count) {
        if (count <= countOwner) {
            countOwner = countOwner - count;
            System.out.println("Выпустила " + count + " гостей, и теперь в общаге " + countOwner + " гостей, всего");
            status = 2;
        } else {
            System.out.println("Я не могу выпустить " + count + " гостей, так как их и так мало в доме");
            status = 2;
        }
        if (countOwner == 0 && countFriend == 0)
            status = 0;
    }

    // Print method
    public void printInfo() {
        String[] operationNames = {"0: Запустить гостей", "1: Выгнать гостей", "2: Запустить хозяев", "3: Выпустить хозяев"};
        for (String elem : operationNames)
            System.out.println(elem);

        System.out.println("Я злобная " + name + " мне " + age + " года");
        if (status == 0) System.out.println("Текущий статус - oбщага пустая, никого не могу выгнать, всех пускаю");
        else if (status == 1) System.out.println("Текущй статус - гостей пока не могу пустить, приходите с друзьями");
        else {
            System.out.println("Текущий статус - все нормально, запускаю и выпускаю за 10 грн");

            System.out.println("countOwners: " + countOwner);
            System.out.println("countFriends: " + countFriend);
        }
    }
}
