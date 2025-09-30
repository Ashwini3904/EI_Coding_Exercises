package builder;

public class PortfolioApp {
    public static void main(String[] args) {
        
        PortfolioBuilder builder1 = new StudentPortfolioBuilder();
        builder1.setName("Ashwini");
        builder1.setEmail("ashwini@example.com");
        builder1.addSkill("Java");
        builder1.addSkill("Spring Boot");
        builder1.addAchievement("Won Hackathon");
        builder1.setExperience("Internship at ABC Corp");
        StudentPortfolio p1 = builder1.build();
        System.out.println(p1);

        System.out.println();
        PortfolioBuilder builder2 = new StudentPortfolioBuilder();
        builder2.setName("Ravi");
        builder2.addSkill("Python");
        builder2.addAchievement("Open Source Contributor");
        StudentPortfolio p2 = builder2.build();
        System.out.println(p2);
    }
}

