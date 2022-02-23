import java.time.LocalDateTime;

public class Account {
    String id;
    int money;
    String deletionTime;

    public Account(String id, int money, String deletionTime){
        this.id = id;
        this.money = money;
        this.deletionTime = deletionTime;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", money=" + money +
                ", deletionTime='" + deletionTime + '\'' +
                '}';
    }
}
