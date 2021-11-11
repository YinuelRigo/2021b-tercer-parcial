package oop.exams.generator;

public class SouthLicensePlateGenerator implements LicensePlateGenerator {

    private String state;

    @Override
    public String generate(String state) {
        this.state = '4' + state;
        return state;
    }
}
