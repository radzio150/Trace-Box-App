package sample.backend;

public class Employee {
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String nationality;
    private String address1;
    private String address2;
    private String town;
    private String postcode;
    private String nis_number;
    private int job_dep_IDFK;
    private int job_station_IDFK;
    private int nfc_card_IDFK;

    public Employee(String first_name, String last_name, String date_of_birth,
                    String nationality, String address1, String address2,
                    String town, String postcode, String nis_number,
                    int job_dep_IDFK, int job_station_IDFK, int nfc_card_IDFK) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.nationality = nationality;
        this.address1 = address1;
        this.address2 = address2;
        this.town = town;
        this.postcode = postcode;
        this.nis_number = nis_number;
        this.job_dep_IDFK = job_dep_IDFK;
        this.job_station_IDFK = job_station_IDFK;
        this.nfc_card_IDFK = nfc_card_IDFK;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getNis_number() {
        return nis_number;
    }

    public void setNis_number(String nis_number) {
        this.nis_number = nis_number;
    }

    public int getJob_dep_IDFK() {
        return job_dep_IDFK;
    }

    public void setJob_dep_IDFK(int job_dep_IDFK) {
        this.job_dep_IDFK = job_dep_IDFK;
    }

    public int getJob_station_IDFK() {
        return job_station_IDFK;
    }

    public void setJob_station_IDFK(int job_station_IDFK) {
        this.job_station_IDFK = job_station_IDFK;
    }

    public int getNfc_card_IDFK() {
        return nfc_card_IDFK;
    }

    public void setNfc_card_IDFK(int nfc_card_IDFK) {
        this.nfc_card_IDFK = nfc_card_IDFK;
    }
    public void updateEmployee(Employee employee){
        //save employee object to db using hibernate
    }
    public void deleteEmployee(Employee employee){
        // delete employee object from the database using hibernate
    }

    public void createEmployee(Employee employee){
        // create new record of employee in db using hibernate
    }
}
