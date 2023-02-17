import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Service> services=new ArrayList<>();

    static class Service {
        String name;
        int price;

        Service(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Adding services to the list
        services.add(new Service("Замена масла", 30));
        services.add(new Service("Балансировка шин", 40));
        services.add(new Service("Замена аккамулятора", 60));
        services.add(new Service("Замена тормозных колодок", 100));
        services.add(new Service("Очистка радиаотра", 80));
        services.add(new Service("Промывка радиатора", 120));
        services.add(new Service("Замена свечей", 50));
        services.add(new Service("Замена кондиционера", 90));
        services.add(new Service("Замена ремня ГРМ", 250));
        services.add(new Service("Замена фар", 80));

        // Printing the list of services
        System.out.println("Пожалуйста, выберите необходимые услуги:");
        for (int i = 0; i < services.size(); i++) {
            System.out.println((i + 1) + ". " + services.get(i).name + " - $" + services.get(i).price);
        }

        // Selecting services
        ArrayList<Service> selectedServices = new ArrayList<>();
        System.out.println("Введите количество услуг, которые вы хотите выбрать, через запятую:");
        String input = scanner.nextLine();
        String[] serviceNumbers = input.split(",");
        for (String s : serviceNumbers) {
            try {
                int serviceIndex = Integer.parseInt(s.trim()) - 1;
                if (serviceIndex >= 0 && serviceIndex < services.size()) {
                    selectedServices.add(services.get(serviceIndex));
                } else {
                    throw new Exception("Invalid service number: " + s);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }

        // Calculating the total price
        int totalPrice = 0;
        for (Service service : selectedServices) {
            totalPrice += service.price;
        }

        // Printing the selected services
        System.out.println("Selected services:");
        for (Service service : selectedServices) {
            System.out.println(service.name + " - $" + service.price);
        }
        System.out.println("Total price: $" + totalPrice);

        // Checking if the user has enough money
        System.out.println("Введите сумму денег, которую вы имеете:");
        int money = 0;
        try {
            money = scanner.nextInt();

            {
                if (money < totalPrice) ;
            }
        } finally {

        }
    }
}


    
