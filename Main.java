public class Main {
    public static void main(String[] args) {
        Department it = new Department();
        it.name = "IT";
        Worker petrov = new Worker();
        petrov.name = "Смоляков";
        petrov.department = it;
        Worker kozlov = new Worker();
        kozlov.name = "Звездова (Карандашова)";
        kozlov.department = it;
        Worker sidorov = new Worker();
        sidorov.name = "Горбунков";
        sidorov.department = it;
        it.chief = kozlov;
        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);
    }
}
