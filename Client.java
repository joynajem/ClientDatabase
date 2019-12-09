import java.util.Scanner;

    class Client {

        private String firstName;
        private String lastName;
        private int age;
        private String maritalStatus;
        private String legalStatus;
        private long clientRefNumber;

        public Client(String first_name, String last_name) {
            this.firstName = first_name;
            this.lastName = last_name;
            this.maritalStatus = setMaritalStatus();
            this.legalStatus = setLegalStatus();
        }

        public String setMaritalStatus() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Single: 1" + "\nMarried: 2" + "\nYou are: ");
            int maritalCode = sc.nextInt();
            if (maritalCode == 1) {return "Single";}
            else if (maritalCode == 2) {return "Married";}
            else {return "Not Specified";}
        }

        public String setLegalStatus() {
            System.out.println("Your Age is: ");
            Scanner sc = new Scanner(System.in);
            int inputAge = sc.nextInt();
            this.age = inputAge;
            if (inputAge < 18 ) {return "Minor";}
            else {return "Adult";}

        }

        public String showInfo() {
            return "Name: " + firstName + " " +
                    "\nLast Name: " + lastName + " " +
                    "\nAge: " + age + " " +
                    "\nMarital Status: " + maritalStatus + " " +
                    "\nLegal Status: " + legalStatus;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String description(int age){
            String desc;
            if (age > 18){ desc = "Adult";}
            else {desc = "child";}
            return desc;
        }
    }
