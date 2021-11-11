package oop.exams.generator;

public class EastLicensePlateGenerator implements LicensePlateGenerator {

    private String state;

    @Override
    public String generate(String state) {
        this.state = '3' + state;
        return state;
    }
}
