public class OfficePet extends Pet{

        private Employee owner;

        public OfficePet(String species) {
            super(species);
        }

        public OfficePet(String species, Employee owner) {
            super(species);
            this.owner = owner;
        }

        public Employee getOwner() {
            return owner;
        }

        public void setOwner(Employee owner) {
            this.owner = owner;
        }

        public static void main(String[] args) {
            Employee craig = new Employee("Craig");
            OfficePet penny = new OfficePet("Guinea Pig", craig);
        }
    }
