package builder;

import java.util.List;

public class StudentPortfolio {
    private String name;
    private String email;
    private List<String> skills;
    private List<String> achievements;
    private String experience;

    StudentPortfolio(String name, String email, List<String> skills,
                     List<String> achievements, String experience) {
        this.name = name;
        this.email = email;
        this.skills = skills;
        this.achievements = achievements;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "\n\nName='" + name + '\'' +
                ", \nEmail='" + email + '\'' +
                ", \nSkills=" + skills +
                ", \nAchievements=" + achievements +
                ", \nExperience='" + experience + '\'' + "\n\n" +
                '}' ;
    }
}

