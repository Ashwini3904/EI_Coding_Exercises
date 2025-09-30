package decorator;

import component.ProgressReport;

public abstract class ProgressReportDecorator implements ProgressReport {
    protected ProgressReport report;

    public ProgressReportDecorator(ProgressReport report) {
        this.report = report;
    }

    @Override
    public void display() {
        report.display();  
    }
}
