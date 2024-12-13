public calss Teacher {
    private String id, name, tchr_class, subject;

    public void Teacher () {

    }

    public void Teacher (String id, String name, String tchr_class, String subject) {
        String id = this.id;
        String name = this.name;
        String tchr_class = this.tchr_class;
        String subject = this.subject;
    }
public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getTchr_class() {
    return tchr_class;
}

public void setTchr_class(String tchr_class) {
    this.tchr_class = tchr_class;
}

public String getSubject() {
    return subject;
}

public void setSubject(String subject) {
    this.subject = subject;
}


}



