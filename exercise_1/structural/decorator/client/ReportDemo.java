package client;

import component.BaseProgressReport;
import component.ProgressReport;
import decorator.*;

public class ReportDemo {
    public static void main(String[] args) {
        ProgressReport baseReport = new BaseProgressReport();

        System.out.println("1. Basic Report:");
        baseReport.display();

        System.out.println("\n2. Report with Badges:");
        ProgressReport withBadges = new BadgeDecorator(baseReport);
        withBadges.display();

        System.out.println("\n3. Report with Badges + Feedback:");
        ProgressReport enhancedReport = new FeedbackDecorator(
                new BadgeDecorator(baseReport),
                "Great job overall, but please focus more on English!"
        );
        enhancedReport.display();
    }
}