import ru.netology.services.FreelanceService;

public class Main {

    public static void main(String[] args) {
        FreelanceService service = new FreelanceService();

        int count = service.calculate(100_000, 60_000, 150_000);
        System.out.println(count);


    }
}
