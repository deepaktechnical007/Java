class Employee {
    private int empid;

    public void setEmpid(int eid) {
        empid = eid;
    }

    public int getEmpid() {
        return empid;
    }
}

class Company {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}