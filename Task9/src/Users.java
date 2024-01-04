public class Users {
    public static void main(String[] args) {
        Main[] users = new Main[3];
        users[0] = new Main("John", "Doe", 25, "admin", true);
        users[1] = new Main("Jane", "Doe", 22, "user", true);
        users[2] = new Main("Jack", "Doe", 18, "user", false);
        Main.packUsers(users);
    }
}
