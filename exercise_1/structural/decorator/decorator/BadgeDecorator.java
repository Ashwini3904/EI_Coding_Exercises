package decorator;

import component.ProgressReport;

public class BadgeDecorator extends ProgressReportDecorator {
    public BadgeDecorator(ProgressReport report) {
        super(report);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Badges: Gold Star for Math, Silver for Science");
    }
}
