import java.util.Objects;



public class Employee {

        private String fullName;
         private int salary;
        private int departament;
        private String id;

        public static void sum(Employee[] employees){
            int sumSalary = 0;
            for (Employee employee : employees) {

                
            }
            
        }








        public Employee(String fullName, int salary, int departamment){
             this.fullName = fullName;
             this.salary = salary;
             this.departament = departamment;
        }

   public String getFullName() {return this.fullName; }
    public int getSalary(){return this.salary; }
    public int getDepartament(){return this.departament;}

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, fullName, departament, salary); }
    @Override
    public String toString(){
            return fullName + ": " + salary + ", " + departament;
    };
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && departament == employee.departament && Objects.equals(fullName, employee.fullName) && Objects.equals(id, employee.id);
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }






}
