package oop.exams.generator;

public class WestLicensePlateGenerator implements LicensePlateGenerator {

    private String state;

    @Override
    public String generate(String state) {
        this.state = '2' + state;
        return state;
    }
}
