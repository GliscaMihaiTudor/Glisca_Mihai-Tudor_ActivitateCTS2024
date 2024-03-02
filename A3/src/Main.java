class HospitalStaffDemo {

    public static void main(String[] args) {
        PersonalSpitalFactory medicFactory = new MedicFactory();
        PersonalSpital medic = medicFactory.creeazaPersonal();
        medic.descriere();

        PersonalSpitalFactory asistentFactory = new AsistentFactory();
        PersonalSpital asistent = asistentFactory.creeazaPersonal();
        asistent.descriere();
    }

    interface PersonalSpitalFactory {
        PersonalSpital creeazaPersonal();
    }

    abstract static class PersonalSpital {
        public abstract void descriere();
    }

    static class Brancardier extends PersonalSpital {
        @Override
        public void descriere() {
            System.out.println("Sunt un brancardier.");
        }
    }

    static class Asistent extends PersonalSpital {
        @Override
        public void descriere() {
            System.out.println("Sunt un asistent.");
        }
    }

    static class Medic extends PersonalSpital {
        @Override
        public void descriere() {
            System.out.println("Sunt un medic.");
        }
    }

    static class BrancardierFactory implements PersonalSpitalFactory {
        @Override
        public PersonalSpital creeazaPersonal() {
            return new Brancardier();
        }
    }

    static class AsistentFactory implements PersonalSpitalFactory {
        @Override
        public PersonalSpital creeazaPersonal() {
            return new Asistent();
        }
    }

    static class MedicFactory implements PersonalSpitalFactory {
        @Override
        public PersonalSpital creeazaPersonal() {
            return new Medic();
        }
    }
}
