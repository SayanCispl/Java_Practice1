package src.Inheritance;

public class Child_in extends  Parent_in{

        private final String firstName;

        // Child constructor
        public Child_in(String familyName, String firstName) {
            super(familyName);  // Must be first statement
            this.firstName = firstName;
            System.out.println("Child constructor called");
        }

        public String getFullName() {
            return firstName + " " + getFamilyName();
        }
}

