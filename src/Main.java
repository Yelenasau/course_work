public class Main {
    //1. Создать класс Employee, который содержит информацию о Ф. И. О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
    //2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
    //3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
    //4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
    //5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
    //6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
    //7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
    //8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
    //    1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    //    2. Посчитать сумму затрат на зарплаты в месяц.
    //    3. Найти сотрудника с минимальной зарплатой.
    //    4. Найти сотрудника с максимальной зарплатой.
    //    5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    //    6. Получить Ф. И. О. всех сотрудников (вывести в консоль)
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 61600);
        employees[1] = new Employee("Петров Петр Петрович", 1, 67500);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 2, 62500);
        employees[3] = new Employee("Федоров Федор Федорович", 2, 66900);
        employees[4] = new Employee("Морозов Михаил Михайлович", 3, 65500);
        employees[5] = new Employee("Федоров Федор Федорович", 3, 55500);
        employees[6] = new Employee("Игорев Игорь Игоревич", 4, 59500);
        employees[7] = new Employee("Борисов Борис Борисович", 4, 75500);
        employees[8] = new Employee("Володин Владимир Владимирович", 5, 85500);
        employees[9] = new Employee("Миронов Мирон Миронович", 5, 45500);
        printAll();
        System.out.println("Сумма затрат в месяц : " + sum());
        findMinSalary();
        findMaxSalary();
        System.out.println("Cредняя зп : " + findAverageSalary());
        printFio();
    }

    static void printAll() {

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static int sum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    static void findMinSalary() {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                index = i;
            }
        }
        System.out.println("Cотрудник с минимальной зп " + employees[index]);
//
    }

    static void findMaxSalary() {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                index = i;
            }
        }
        System.out.println("Cотрудник с максимальной зп " + employees[index]);
    }

    static double findAverageSalary() {
        double sum = 0;
        double averageValue = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
            averageValue = (double)sum / employees.length;
        }
        return averageValue;
    }

    static void printFio() {
        for (Employee employee : employees) {
            System.out.println(employee.getFio());
        }

    }
}
