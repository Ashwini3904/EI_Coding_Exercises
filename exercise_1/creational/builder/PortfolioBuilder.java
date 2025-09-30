package builder;

public interface PortfolioBuilder {
    void setName(String name);
    void setEmail(String email);
    void addSkill(String skill);
    void addAchievement(String achievement);
    void setExperience(String experience);

    StudentPortfolio build();
}

