package decorator;

import component.ProgressReport;

public class FeedbackDecorator extends ProgressReportDecorator {
    private String feedback;

    public FeedbackDecorator(ProgressReport report, String feedback) {
        super(report);
        this.feedback = feedback;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Teacher's Feedback: " + feedback);
    }
}
