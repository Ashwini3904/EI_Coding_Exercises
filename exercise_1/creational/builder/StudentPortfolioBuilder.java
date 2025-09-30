package builder;

import java.util.ArrayList;
import java.util.List;
 
public class StudentPortfolioBuilder implements PortfolioBuilder {
    private String name;
    private String email;
    private List<String> skills = new ArrayList<>();
    private List<String> achievements = new ArrayList<>();
    private String experience;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void addSkill(String skill) {
        skills.add(skill);
    }

    @Override
    public void addAchievement(String achievement) {
        achievements.add(achievement);
    }

    @Override
    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public StudentPortfolio build() {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("Name is required for portfolio");
        }
        return new StudentPortfolio(name, email, skills, achievements, experience);
    }
}
