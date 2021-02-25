package danit.hw.homework4;

import java.util.List;

public class Pet {
    private String species;
    private String nickname;
    private Integer age;
    private Integer trickLevel;
    private List<String> habits;

    public Pet(String species, String nickname, Integer age, Integer trickLevel, List<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I'm eating.");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!", this.nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up.");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(Integer trickLevel) {
        this.trickLevel = trickLevel;
    }

    public List<String> getHabits() {
        return habits;
    }

    public void setHabits(List<String> habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return String.format("%s[nickname='%s', age=%d, trickLevel=%d, habits=%s]",
                this.species, this.nickname, this.age, this.trickLevel, this.habits.toString());
    }
}