package az.et.danit.hw.homework4;

public class Human {
    private String name;
    private String surname;
    private Integer birthYear;
    private Integer iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human(String name, String surname, Integer birthYear, Integer iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.printf("Hello, %s", this.pet.getNickname());
    }

    public void describePet() {
        System.out.printf("I have a %s, he is %d years old, he is %s",
                this.pet.getSpecies(), this.pet.getAge(), this.pet.getTrickLevel() >= 50 ? "very sly" : "almost not sly");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return String.format("Human[name='%s', surname='%s', birthYear=%d, iq=%d, mother=%s, father=%s, pet=%s]",
                this.name, this.surname, this.birthYear, this.iq, this.mother.getName(), this.father.getName(), this.pet.toString()
        );
    }
}