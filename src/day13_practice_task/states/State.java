package day13_practice_task.states;

public class State {
    private String name;
    private String abbreviation;
    private String politicalParty;
    private String Governor;
    private String senator;
    private int population;

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank() ){
            System.err.println("Name can not be null: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {

        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isEmpty() || abbreviation.isBlank() ){
            System.err.println("Abbreviation can not be null: " + abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {

        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.isEmpty() || politicalParty.isBlank() ){
            System.err.println("PoliticalParty can not be null: " + politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {

        return Governor;
    }

    public void setGovernor(String Governor) {
        if (Governor == null || Governor.isEmpty() || Governor.isBlank() ) {
            System.err.println("PoliticalParty can not be null: " + Governor);
            System.exit(1);
        }
        this.Governor = Governor;
    }

    public String getSenator() {

        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.isEmpty() || senator.isBlank() ) {
            System.err.println("Senator can not be null: " + senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {

        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0){
            System.err.println("Population must be greater than zero" + population);
            System.exit(1);
        }
        this.population = population;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
