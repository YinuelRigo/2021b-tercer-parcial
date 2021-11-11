package oop.exams.generator;

public class CenterLicensePlateGenerator implements LicensePlateGenerator {

    private String state;

    @Override
    public String generate(String state) {
        this.state = '5' + state;
        return state;
    }
}
