public class Customer {

        String name;
        long creditLimit;
        String email;

    public Customer() {
        this("NoBody", "nobody@gmail.com");
    }

    public Customer(String name, String email) {
        this(name,1000,email);
    }

        public Customer(String name, long creditLimit, String email) {
            this.name = name;
            this.creditLimit = creditLimit;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public long getCreditLimit() {
            return creditLimit;
        }

        public String getEmail() {
            return email;
        }
    }

