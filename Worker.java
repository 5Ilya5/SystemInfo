public class Worker {
    public String name;
    public Department department;
    public String toString() {
        if(name.equals(department.chief.name)){
            return name + " начальник отдела " + department.name;
        }else {
            return name + " работает в отделе " + department.name + ", начальник которого " + department.chief.name;
        }
    }
}
