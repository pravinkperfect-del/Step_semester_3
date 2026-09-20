package main.java.Session1_java_String.class_problems;

class ReverseCustomerName {

    static String reverseCustomerName(String customerName) {

        String reversed = "";

        for (int i = customerName.length() - 1; i >= 0; i--) {
            reversed += customerName.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        String name = "Sunil";

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " +
                reverseCustomerName(name));
    }
}