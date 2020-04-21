public class Man {
    private int id;
    private String name;
    private String surname;
    private String contact;

    public Man(String name, String surname, String contact) {
        this.name = name;
        this.surname = surname;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
