import java.util.ArrayList;

public class GetPackageInfo{
    public static void main(String[] args) {
        Class<ArrayList> classObject = ArrayList.class;

        // Get the package object from the class
        Package packageObject = classObject.getPackage();

        // Check if package information is available
        if (packageObject != null) {
            System.out.println("Package Name: " + packageObject.getName());

            System.out.println("Implementation Vendor: " + 
                (packageObject.getImplementationVendor() != null ? packageObject.getImplementationVendor() : "N/A"));

            System.out.println("Implementation Title: " + 
                (packageObject.getImplementationTitle() != null ? packageObject.getImplementationTitle() : "N/A"));

            System.out.println("Implementation Version: " + 
                (packageObject.getImplementationVersion() != null ? packageObject.getImplementationVersion() : "N/A"));

            System.out.println("Specification Vendor: " + 
                (packageObject.getSpecificationVendor() != null ? packageObject.getSpecificationVendor() : "N/A"));

            System.out.println("Specification Title: " + 
                (packageObject.getSpecificationTitle() != null ? packageObject.getSpecificationTitle() : "N/A"));
                
            System.out.println("Specification Version: " + 
                (packageObject.getSpecificationVersion() != null ? packageObject.getSpecificationVersion() : "N/A"));
        } else {
            System.out.println("No package information available.");
        }
    }
}
