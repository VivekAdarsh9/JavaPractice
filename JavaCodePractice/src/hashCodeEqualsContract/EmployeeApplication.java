package hashCodeEqualsContract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


class CopyEmployee {
    private int empId;
    private String firstName;
    private String designation;
    private Date dob;

    public CopyEmployee(int empId, String firstName, String designation, Date dob) {
        this.empId = empId;
        this.firstName = firstName;
        this.designation = designation;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee [designation=" + designation + ", dob=" + dob + ", empId=" + empId + ", firstName=" + firstName
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((designation == null) ? 0 : designation.hashCode());
        result = prime * result + ((dob == null) ? 0 : dob.hashCode());
        result = prime * result + empId;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        return result;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     CopyEmployee other = (CopyEmployee) obj;
    //     if (designation == null) {
    //         if (other.designation != null)
    //             return false;
    //     } else if (!designation.equals(other.designation))
    //         return false;
    //     if (dob == null) {
    //         if (other.dob != null)
    //             return false;
    //     } else if (!dob.equals(other.dob))
    //         return false;
    //     if (empId != other.empId)
    //         return false;
    //     if (firstName == null) {
    //         if (other.firstName != null)
    //             return false;
    //     } else if (!firstName.equals(other.firstName))
    //         return false;
    //     return true;
    // }



    @Override
    public boolean equals(Object obj) {
        CopyEmployee cemp = (CopyEmployee) obj;

        // if (obj == null || getClass() != obj.getClass()) {
        //     return false;
        // }
        // if(obj==this){
        //     return true;
        // }
        if (empId != cemp.empId)
            return false;

        return true;
}
    }



class Employee extends CopyEmployee {
    private int empId;
    private String firstName;
    private String designation;
    private Date dob;

    public Employee(int empId, String firstName, String designation, Date dob) {
        super(empId, firstName, designation, dob);
        this.empId = empId;
        this.firstName = firstName;
        this.designation = designation;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee [designation=" + designation + ", dob=" + dob + ", empId=" + empId + ", firstName=" + firstName
                + "]";
    }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((designation == null) ? 0 : designation.hashCode());
    //     result = prime * result + ((dob == null) ? 0 : dob.hashCode());
    //     result = prime * result + empId;
    //     result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    //     return result;
    // }

    @Override
    public boolean equals(Object obj) {
        // if (this == obj)
        //     return true;
        // if (obj == null)
        //     return false;
        // if (getClass() != obj.getClass())
        //     return false;
        // Employee other = (Employee) obj;
        // if (designation == null) {
        //     if (other.designation != null)
        //         return false;
        // } else if (!designation.equals(other.designation))
        //     return false;
        // if (dob == null) {
        //     if (other.dob != null)
        //         return false;
        // } else if (!dob.equals(other.dob))
        //     return false;
        // if (empId != other.empId)
        //     return false;
        // if (firstName == null) {
        //     if (other.firstName != null)
        //         return false;
        // } else if (!firstName.equals(other.firstName))
        //     return false;
        // return true;


        Employee emp = (Employee) obj;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (empId != emp.empId)
            return false;

        return true;
    }


}

class EmployeeApplication {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String dateInString = "7-Jun-2013";
        Date date = formatter.parse(dateInString);
        Employee e1 = new Employee(001, "Vivek", "Program Lead", date);
        Employee e2 = new Employee(001, "Vivek", "Program Lead", date);
        CopyEmployee ce1 = new CopyEmployee(001, "Vivek", "Program Lead", date);


        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(ce1.hashCode());
        System.out.println("Deep Compare "+ ce1.equals(e1));
        System.out.println("Shallow Compare"+ (e1==e2));

    }
}
