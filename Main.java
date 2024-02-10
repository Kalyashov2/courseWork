import java.util.Arrays;
public class Main {
  public static void employeeList(Employee[] employees) {
      for (Employee employee : employees) {
          System.out.println(employee);
      }
  }
  private static void sumSalary(Employee[] employees){
      int sum = 0;
      for (Employee employee : employees){
          if(employee != null){
              sum = sum + employee.getSalary();
          }
      }
      sum = sum;
      System.out.println("Cумма зарплат равна: " + sum);

  }
  public static void name(Employee[] employees){
      String a;
      for(Employee employee : employees){
          a = employee.getFullName();
          System.out.println("ФИО работника: "+ a);
      }
  }
    private static void sredSalary(Employee[] employees){
        int sum = 0;
        for (Employee employee : employees){
            if(employee != null){
                sum = sum + employee.getSalary();
            }
        }
        sum = sum / 2;
        System.out.println("Среднее значение зарплат: " + sum);
    }
    public static void maxSalary(Employee[] employees){
      int max = 0;
     for (Employee employee : employees){
         if (max < employee.getSalary()){
             max = employee.getSalary();
         }
     }
        System.out.println("Максимальная зарплата равна: " + max);
    }

    public static void minSalary(Employee[] employees) {
      double min = 0;
      for(int a = 0; a < employees.length; a++){
          if(a==0){
              min = employees[a].getSalary();
          }
          if (employees[a] != null){
              if (employees[a].getSalary() < min){
                  min = employees[a].getSalary();
              }
          }

      }
        System.out.println("Минимальная зарплата равна: " + min);





            }


    public static void main(String[] args) {
        Employee[] employee = new Employee[]{
                new Employee("Иванов Иван Иванович",  1000,  1),
                new Employee("Каляшов Григорий Андреевич", 2000, 2),
                new Employee("Кузнецов Андрей Андреевич", 1231241212, 4),
                new Employee("Каляшов Иван Андреевич", 40000000, 2),
                new Employee("Галоша Павел Сергеевич", 1010000, 3),

        };



        //System.out.print(Arrays.toString(employee));
        employeeList(employee);
       sumSalary(employee);
       name(employee);
       sredSalary(employee);
       maxSalary(employee);
       minSalary(employee);

    }




}
