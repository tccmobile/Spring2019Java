public class Author {

    private String name;
    private Integer publications;

    public Author() {
        name = "";
        publications = 0;
    }

    public Author(String name, Integer publications) {
        this.name = name;
        this.publications = publications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPublications() {
        return publications;
    }

    public void setPublications(Integer publications) {
        this.publications = publications;
    }
}
