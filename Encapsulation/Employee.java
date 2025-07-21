package Encapsulation;

public class Employee {
    private String id;
    private String name;
    private String dept;
    private double baseSalary;
    private double bonus;

    public Employee(String id, String name, String dept, double baseSalary, double bonus) {
        setId(id);
        setName(name);
        setDept(dept);
        setBaseSalary(baseSalary);
        setBonus(bonus);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id!=null && !id.trim().isEmpty()){
            this.id = id;
        } else{
            System.out.println("ID cannot be null or empty");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name.trim().length()>=3){
            this.name = name;
        } else{
            System.out.println("Name must be at least 3 char long");
        }
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        if(dept != null && (dept.equals("HR")||dept.equals("Sales")||dept.equals("IT"))){
            this.dept = dept;
        } else{
            System.out.println("Dept should be HR or Sales or IT");
        }
    }

    public String getRole() {
        if(getBaseSalary()>20000){
            return "Senior";
        }
        else{
            return "Junior";
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary>=10000){
            this.baseSalary = baseSalary;
        }else{
            System.out.println("Salary should be greater or equal 10000");
        }
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if(bonus>=0){
            this.bonus = bonus;
        } else{
            System.out.println("Bonus should be greater or equal 0.");
        }
    }
    public boolean isEligibleForBonus(){
        return getBonus() >= 1000;
    }

    public double getTotalSalary(){
        return getBaseSalary()+getBonus();
    }

    public String toString(){
        return "Employee ID:"+getId()+", Name:"+getName()+", Dept:"+getDept()+", Role:"+getRole()+", Total Salary:"+getTotalSalary();
    }
}
