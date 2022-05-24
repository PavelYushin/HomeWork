package Lesson5;

public class HW5 {
    public static void main(String[] args) {

        Person mainEmployee = new Person("Alex", "Valerevich",
                "Gladkov", "8(499)000-11-22",
                "Test Manager", 80000, 1986);

        Person[] office = {
                mainEmployee,
                new Person("Andrey", "Andreevich",
                        "Wolk", "8(499)111-22-33",
                        "project owner", 520000, 1973),
                new Person("Evgenii", "Evgenievich",
                        "Zaicev", "8(499)222-33-44",
                        "project manager", 40000, 1963),
                new Person("Nataliya", "Natalievna",
                        "Mamedova", "8(499)333-44-55",
                        "senior developer", 90000, 1990),
                new Person("Georgii", "Georgievich",
                        "Shpak", "8(499)444-55-66",
                        "engineer", 50000, 1983)
        };

        getAllPersonsInOffice(office);
        System.out.println("***************");
        getOldPerson(office, 40);

    }

    private static void getOldPerson(Person[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > year) {
                System.out.println(office[i].getFullInfo());
            }
    }


    private static void getAllPersonsInOffice(Person[] office) {
        System.out.println("All person: ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
    }
}
