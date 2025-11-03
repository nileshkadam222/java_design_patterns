package testing.streams.Design.dp.singleton.solid.singleresponsiblity;

public class Account {
    int id;
    int name;

    public Account(int id, int name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
