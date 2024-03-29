package lab4;

public class Main {
    public static void main(String[] args) {
        Employee.EmployeeBuilder employeeBuilder = new Employee.EmployeeBuilder("gsakgddsg Smithers")
                .setSalary(100.0)
                .setAddress("")
                .setPhoneNumber("3809500000009999999")
                .setIsInsuranced(true);

// test
        Employee employee1 = employeeBuilder.build();
        System.out.println(employee1);

        Supplier.SupplierBuilder supplierBuilder = new Supplier.SupplierBuilder("fdbeang")
                .setAddress("Universitetska,20")
                .setContactPerson(employee1);

        Supplier supplier1 = supplierBuilder.build();
        System.out.println(supplier1);

        Product.ProductBuilder productBuilder = new Product.ProductBuilder(10, "j")
                .setCategory("gsdfg")
                .setQuantity(12410)
                .setPrice(10);

        Product p = productBuilder.build();

    }
}